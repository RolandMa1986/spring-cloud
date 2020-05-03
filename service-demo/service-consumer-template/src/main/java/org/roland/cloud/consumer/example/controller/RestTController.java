package org.roland.cloud.consumer.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestTController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private RestTemplate restTemplate1;

    @GetMapping("/echo-rest/{str}")
    public String rest(@PathVariable String str) {
        return restTemplate.getForObject("http://service-provider/echo/" + str,
                String.class);
    }

    @GetMapping("/index")
    public String index() {
        return restTemplate1.getForObject("http://service-provider", String.class);
    }

    @GetMapping("/test")
    public String test() {
        return restTemplate1.getForObject("http://service-provider/test", String.class);
    }

    @GetMapping("/sleep")
    public String sleep() {
        return restTemplate1.getForObject("http://service-provider/sleep", String.class);
    }

}
