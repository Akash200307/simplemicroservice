package com.eureka.client.eureka_client.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(value = "dashboard-service/api/v1")
public class Dashboard {
    HashMap<String, String> response;

    @GetMapping("/details")

    public ResponseEntity<HashMap<String, String>> dasboardRespnse() {
        String res = "I am from dashboard service";
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
