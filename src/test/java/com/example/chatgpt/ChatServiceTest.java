package com.example.chatgpt;

import com.example.chatgpt.model.ChatRequest;
import com.example.chatgpt.service.ChatServiceImpl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChatServiceTest {

    private ChatServiceImpl ChatService  = new ChatServiceImpl();

    @Test
    void testGenerateResponse() {
        ChatRequest request = new ChatRequest();
        request.setPrompt("Test Prompt");

        String response = ChatService.generateResponse(request);
        assertNotNull(response);
        assertTrue(response.contains("Test Prompt"));
    }
}