package com.company.microservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api") // Base path for all endpoints in this controller
public class Controller {
	
    // Endpoint to greet users
    @GetMapping("/greet")
    public ResponseEntity<String> greet() {
        return ResponseEntity.ok("Hello, welcome to our microservice!"); // Greeting message
    }

    // Endpoint to get a specific resource
    @GetMapping("/resource/{id}")
    public ResponseEntity<String> getResource(@PathVariable("id") String id) {
    	String resource=" ";
    	int numero = Integer.parseInt(resource);
    	if(numero == 1) {
        resource = "YEAH";
        }
    	else {
    		resource="YOU LOSE";
    	}
        return ResponseEntity.ok(resource);
    }

    // Endpoint to create a new resource
    @PostMapping("/resource")
    public ResponseEntity<String> createResource(@RequestBody String resource) {
        // Logic to create a new resource based on the provided data
        // For simplicity, just echoing back the created resource
        return ResponseEntity.ok("Resource created: " + resource);
    }

    // Endpoint to update an existing resource
    @PutMapping("/resource/{id}")
    public ResponseEntity<String> updateResource(@PathVariable("id") String id, @RequestBody String updatedResource) {
        // Logic to update the resource with the given ID
        // For simplicity, just echoing back the updated resource
        return ResponseEntity.ok("Resource with ID " + id + " updated: " + updatedResource);
    }

    // Endpoint to delete a resource
    @DeleteMapping("/resource/{id}")
    public ResponseEntity<String> deleteResource(@PathVariable("id") String id) {
        // Logic to delete the resource with the given ID
        // For simplicity, just acknowledging the deletion
        return ResponseEntity.ok("Resource with ID " + id + " deleted");
    }
}
