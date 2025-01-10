package com.example.chatgpt.validation;

import com.example.chatgpt.model.ChatRequest;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class ChatRequestValidator implements Validator {

    @SuppressWarnings("null")
    @Override
    public boolean supports(Class<?> clazz) {
        return ChatRequest.class.isAssignableFrom(clazz);
    }

    @SuppressWarnings("null")
    @Override
    public void validate(Object target, Errors errors) {
        ChatRequest request = (ChatRequest) target;
        if (request.getPrompt() == null || request.getPrompt().trim().isEmpty()) {
            errors.rejectValue("prompt", "prompt.empty", "Prompt cannot be blank");
        }
    }
}