package com.example.mongotest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@EnableMongoAuditing
@SpringBootApplication
public class MongoTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(MongoTestApplication.class, args);
    }
}
