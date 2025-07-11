package com.dieauktion.cloudservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aws/s3item")
public class ItemFileController {

    @GetMapping("/itemimage")
    public ResponseEntity<?> getItemImage(){
        return ResponseEntity.ok("hello");
    }
}
