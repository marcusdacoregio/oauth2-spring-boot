package com.marcusdacoregio.authservice.config.mongodb;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.marcusdacoregio.authservice.repository")
public class MongoConfig {

}
