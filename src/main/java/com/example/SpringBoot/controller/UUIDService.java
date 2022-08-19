package com.example.SpringBoot.controller;

import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class UUIDService {
    public UUID getUUID() {
        return UUID.randomUUID();
    }
}
