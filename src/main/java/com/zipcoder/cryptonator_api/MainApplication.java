package com.zipcoder.cryptonator_api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }


    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) {
        return args -> {
            this.sampleFetch(restTemplate);
        };
    }

    private void sampleFetch(RestTemplate restTemplate) {
        String uriString = "https://api.cryptonator.com/api/btc-usd/ticker";
        System.out.println("Fetching object from cryptonator.com");
        System.out.println("Attempting to retrieve object from URI...");
        System.out.println(uriString);
        Object jsonObject = restTemplate.getForObject(uriString, Object.class);
        System.out.println(jsonObject.toString());
    }
    //THIS IS JUST A GENERAL SETUP, DEPENDING ON WHAT MAPPING ACTIONS ARE ALLOWED BY THE OUTSIDE API
    //THAT DEPENDS ON WHICH MAPPING ACTIONS WOULD WORK. YOU CAN FIND OUT WHAT MAPPING ACTIONS ARE ALLOWED
    //ON THE API BY USING POSTMAN AND EXECUTING AN OPTIONS REQUEST, AT VERY LEAST THE GETMAPPING
    //SHOULD WORK. GOING TO COME BACK LATER AND ADJUST DATATYPES FOR A DIFFERENT OUTSIDE API
}