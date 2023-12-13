"use strict"


const chatBox = document.getElementById('chatBox');
const userInput = document.getElementById('userInput');
const chatContainer = document.getElementById('chatContainer');

function sendMessage() {
    const message = userInput.value;
    if (message.trim() === '') return;

    appendMessage('You', message);
    userInput.value = '';

    // Simulate AI response (replace this with your AI logic)
    const aiResponse = getAIResponse(message);
    setTimeout(() => {
        appendMessage('AI', aiResponse);
        chatContainer.scrollTop = chatContainer.scrollHeight; // Scroll to the bottom
    }, 500);
}

function appendMessage(sender, message) {
    const messageDiv = document.createElement('div');
    messageDiv.className = sender.toLowerCase();
    messageDiv.innerHTML = `<strong>${sender}:</strong> ${message}`;
    chatBox.appendChild(messageDiv);
}


function getAIResponse(userMessage) {
    // Replace this with your actual AI logic
    const responses = [
        "I'm sorry, I don't understand.",
        "Could you please provide more details?",
        "That's interesting! Tell me more.",
        "I'm here to help. What can I do for you?",
    ];

    return responses[Math.floor(Math.random() * responses.length)];
}
