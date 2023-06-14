package com.iteyes.mini.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
@AllArgsConstructor
public class SampleController {

    @GetMapping
    public ResponseEntity<?> sample() {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
