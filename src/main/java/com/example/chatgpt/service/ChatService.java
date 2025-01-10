package com.example.chatgpt.service;

import com.example.chatgpt.model.ChatRequest;
import com.example.chatgpt.entity.ChatHistory;
import java.util.List;

public interface ChatService {
    String generateResponse(ChatRequest chatRequest);
    List<ChatHistory> getChatHistory();
}