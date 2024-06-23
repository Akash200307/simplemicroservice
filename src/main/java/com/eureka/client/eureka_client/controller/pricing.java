package com.eureka.client.eureka_client.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(value = "pricing-service/api/v1")

public class pricing {
    HashMap<String, String> response;

    @GetMapping("/pricing")
    public ResponseEntity<HashMap<String, String>> DasboardRespnse() {
        String res = "I am from pricing service";
        response = new HashMap<>();
        response.put("response", res);
        return new ResponseEntity<HashMap<String, String>>(response, HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<HashMap<String, String>> start() {
        response = new HashMap<>();
        response.put("response", "hello");
        return new ResponseEntity<HashMap<String, String>>(response, HttpStatus.OK);

    }

}
