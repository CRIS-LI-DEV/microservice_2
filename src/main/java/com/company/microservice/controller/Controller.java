package com.company.microservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api") 
public class Controller {

 
    @GetMapping("/greet")
    public ResponseEntity<String> greet() {
        return ResponseEntity.ok("Hello, welcome to our microservice!"); // Greeting message
    }

  
    @GetMapping("/resource/{id}")
    public ResponseEntity<String> getResource(@PathVariable("id") String id) {
        String resource = "Resource with ID " + id;
        return ResponseEntity.ok(resource);
    }

   
    @PostMapping("/resource")
    public ResponseEntity<String> createResource(@RequestBody String resource) {
        return ResponseEntity.ok("Resource created: " + resource);
    }

     @PutMapping("/resource/{id}")
    public ResponseEntity<String> updateResource(@PathVariable("id") String id, @RequestBody String updatedResource) {
         return ResponseEntity.ok("Resource with ID " + id + " updated: " + updatedResource);
    }

    @DeleteMapping("/resource/{id}")
    public ResponseEntity<String> deleteResource(@PathVariable("id") String id) {
          return ResponseEntity.ok("Resource with ID " + id + " deleted");
    }
}
