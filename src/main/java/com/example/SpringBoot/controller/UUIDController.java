package com.example.SpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UUIDController {
    @Autowired
    private UUIDService service;

    @GetMapping("/uuid")
    public List<UUIDGenerate> uuids(@RequestParam("size") int size) {

        for (int i = 0; i < size; i++) {
            service.init();
        }
        return service.getUuids();
    }
}

