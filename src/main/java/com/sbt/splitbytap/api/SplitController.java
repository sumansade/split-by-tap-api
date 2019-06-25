package com.sbt.splitbytap.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path= "/")
public class SplitController {

    @GetMapping
    @RequestMapping(path="/hello")
    public ResponseEntity<String> sayHello(){
        return new ResponseEntity<>("Testing branch", HttpStatus.OK);
    }
}
