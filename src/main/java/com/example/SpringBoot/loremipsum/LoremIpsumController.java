package com.example.SpringBoot.loremipsum;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoremIpsumController {
    @GetMapping("/")
    public String LoremIpsum(){
        return "template";

    }
}
