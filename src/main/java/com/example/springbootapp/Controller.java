package com.example.springbootapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@Slf4j
public class Controller {

  @GetMapping
  public String getAll(){
    log.info("Start to get all data here");
    log.info("Retrieving data");
    log.info("Retrieve data successful");
    return "Hello Springboot app lêuueueueueuueuee";
  }

  @PostMapping("/add")
  public String postAll(@RequestBody Student student){
    log.info("Start to get all data Student with id "+ student.getId());
    log.info("Start to get all data Student with name "+ student.getName());
    log.info("Retrieve data successful student "+ student);
    return "Student: "+ student.getId() + " " + student.getName();
  }
}
