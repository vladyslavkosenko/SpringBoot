package com.example.SpringBoot.controller;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static java.util.UUID.randomUUID;

@Service
public class UUIDService {
    List<UUIDGenerate> uuids = new ArrayList<>();

    public void init(){
        UUIDGenerate uuid = new UUIDGenerate();
        uuid.setUuid(randomUUID());
        uuids.add(uuid);

    }

    public List<UUIDGenerate> getUuids() {
        return uuids;
    }
}
