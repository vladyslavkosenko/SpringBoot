package com.example.SpringBoot.controller;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static java.util.UUID.randomUUID;

@Service
public class UUIDService {
    List<UUIDGenerate> uuids = new ArrayList<>();
    private final UUIDGenerate uuid;

    public UUIDService(UUIDGenerate uuid) {
        this.uuid = uuid;
    }

    public void init() {

        uuid.setUuid(randomUUID());
        boolean add = uuids.add(uuid);
    }

    public List<UUIDGenerate> getUuids() {
        return uuids;
    }
}
