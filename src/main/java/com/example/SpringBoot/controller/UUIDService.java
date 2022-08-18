package com.example.SpringBoot.controller;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class UUIDService {
    List<UUID> uuids = new ArrayList<>();

    public void init(){
        UUID uuid = new UUID();
        uuid.setUuid(BigDecimal.valueOf((Math.random() * 10)));
        uuids.add(uuid);

    }

    public List<UUID> getUuids() {
        return uuids;
    }
}
