package com.example.chatgpt.service;

import com.example.chatgpt.entity.ChatHistory;
import com.example.chatgpt.model.ChatRequest;
import com.example.chatgpt.repository.ChatHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatServiceImpl implements ChatService {

    @Autowired
    private ChatHistoryRepository chatHistoryRepository;

    @Override
    public String generateResponse(ChatRequest chatRequest) {
        String response = "Response for: " + chatRequest.getPrompt();
        ChatHistory chatHistory = new ChatHistory();
        chatHistory.setPrompt(chatRequest.getPrompt());
        chatHistory.setResponse(response);
        chatHistoryRepository.save(chatHistory);
        return response;
    }

    @Override
    public List<ChatHistory> getChatHistory() {
        return chatHistoryRepository.findAll();
    }
}