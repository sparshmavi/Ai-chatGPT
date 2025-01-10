package com.example.chatgpt.model;

public class ChatRequest {

    @NotBlank(message = "Prompt cannot be blank")
    private String prompt;

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }
}