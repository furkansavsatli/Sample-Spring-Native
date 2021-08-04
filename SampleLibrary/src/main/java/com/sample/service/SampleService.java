package com.sample.service;


import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

@Service
public class SampleService {

    public SampleService() throws IOException {
        System.out.println("i'am groot 1");
        InputStream resource = new ClassPathResource(
                "files.txt").getInputStream();
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(resource))) {
            String msg = reader.lines()
                    .collect(Collectors.joining("\n"));
            System.out.println(msg);
        }
    }
}
