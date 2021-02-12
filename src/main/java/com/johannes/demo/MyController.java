package com.johannes.demo;

import lombok.extern.log4j.Log4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@Log4j
@RestController
public class MyController {

    @RequestMapping("/hello")
    public Map hello() {
        log.info("hello johannes");
        log.debug("hello liesbeth");
        return Collections.singletonMap("message", "hello springboot from AAA");
    }

    @ExceptionHandler(Exception.class)
    public void exception(Exception ex) {
        ex.printStackTrace();
    }
}
