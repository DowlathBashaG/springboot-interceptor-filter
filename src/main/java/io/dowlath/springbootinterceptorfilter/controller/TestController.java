package io.dowlath.springbootinterceptorfilter.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class TestController {

    private static final Logger log = LoggerFactory.getLogger(TestController.class);

    @GetMapping("/hello")
    public String getHello(){
        log.info("Inside getHello method of TestController");
        return "Hello";
    }

    @GetMapping("/hi")
    public ResponseEntity<String> getHi(){
        log.info("Inside getHi method of TestController");
        HttpHeaders headers = new HttpHeaders();
        headers.add("custom-controller","controller-value");
        return new ResponseEntity<>("Hi", headers,HttpStatus.OK);
    }
}
