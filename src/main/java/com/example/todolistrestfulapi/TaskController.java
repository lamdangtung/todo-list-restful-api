package com.example.todolistrestfulapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @GetMapping("/all")
    ResponseEntity<?> getAllTasks(){
        return ResponseEntity.ok("All Tasks");
    }
}
