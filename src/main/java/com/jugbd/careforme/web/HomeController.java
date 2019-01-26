package com.jugbd.careforme.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;

@Slf4j
@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        log.info("serving index: {}", LocalDateTime.now());

        return "index";
    }
}
