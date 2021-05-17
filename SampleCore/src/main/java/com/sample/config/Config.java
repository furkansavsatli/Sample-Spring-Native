package com.sample.config;


import com.sample.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Autowired
    public SampleService sampleService;

}
