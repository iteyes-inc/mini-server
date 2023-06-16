package com.iteyes.mini.controller;

import com.iteyes.mini.request.SampleRequest;
import com.iteyes.mini.service.SampleService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sample")
@AllArgsConstructor
public class SampleController {

    private final SampleService sampleService;

    @PostMapping
    public ResponseEntity<?> addSample(@RequestBody SampleRequest sampleRequest) {
        return new ResponseEntity<>(sampleService.addSample(sampleRequest), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<?> getSample(@RequestParam Long id) {
        return new ResponseEntity<>(sampleService.getSample(id), HttpStatus.OK);
    }
}
