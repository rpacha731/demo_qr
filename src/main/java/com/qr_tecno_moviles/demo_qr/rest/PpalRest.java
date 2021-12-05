package com.qr_tecno_moviles.demo_qr.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PpalRest {
    @GetMapping("/")
    public String hello() {
        return "OK";
    }
}
