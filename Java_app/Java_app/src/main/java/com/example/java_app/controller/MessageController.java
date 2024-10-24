package com.example.java_app.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import com.example.java_app.model.Message;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/messages")
public class MessageController {
    // Store messages in memory for simplicity
    private final List<Message> messages = new ArrayList<>();

    // GET endpoint to retrieve all messages
    @GetMapping
    public List<Message> getAllMessages() {
        return messages;
    }

    // POST endpoint to send a new message
    @PostMapping
    public Message sendMessage(@RequestBody Message message) {
        messages.add(message);
        return message;
    }

    // DELETE endpoint to clear all messages (optional)
    @DeleteMapping
    public void clearMessages() {
        messages.clear();
    }
}

