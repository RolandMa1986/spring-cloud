package org.roland.cloud.consumer.example.config;

import com.alibaba.cloud.sentinel.annotation.SentinelRestTemplate;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApllicationContextConfig {
    @LoadBalanced
    @Bean
    @SentinelRestTemplate(urlCleanerClass = UrlCleaner.class, urlCleaner = "clean")
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @LoadBalanced
    @Bean
    @SentinelRestTemplate
    public RestTemplate restTemplate1() {
        return new RestTemplate();
    }

}
class UrlCleaner {

    public static String clean(String url) {
        System.out.println("enter urlCleaner");
        if (url.matches(".*/echo/.*")) {
            System.out.println("change url");
            url = url.replaceAll("/echo/.*", "/echo/{str}");
        }
        return url;
    }

}