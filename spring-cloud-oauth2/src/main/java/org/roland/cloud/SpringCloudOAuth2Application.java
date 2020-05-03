package org.roland.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudOAuth2Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudOAuth2Application.class, args);
    }
}
