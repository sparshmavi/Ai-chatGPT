package com.example.chatgpt.controller;

import com.example.chatgpt.model.ChatRequest;
import com.example.chatgpt.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ChatController {

    @Autowired
    private ChatService chatService;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/chat")
    public String chat() {
        return "chat";
    }

    @PostMapping("/api/chat/generate")
    public String generateResponse(@ModelAttribute ChatRequest chatRequest, Model model) {
        String response = chatService.generateResponse(chatRequest);
        model.addAttribute("response", response);
        return "chat";
    }
}