package com.example.SpringBoot.controller;

import org.example.UUIDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
public class UUIDController {
    private final UUIDService uuidService;

    @Autowired
    public UUIDController(UUIDService uuidService) {
        this.uuidService = uuidService;
    }

    @GetMapping("/uuid")
    public List<UUID> getUuidList(@RequestParam("size") int size) {

        return uuidService.getUUID(size);
    }
}