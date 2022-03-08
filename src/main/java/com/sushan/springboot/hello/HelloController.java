package com.sushan.springboot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String saySsup() {

        return "Sushan's first Spring REST Request!";
    }
}
