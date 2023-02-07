package com.example.keyvault;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class PropertySourceApplication implements CommandLineRunner {

    @Value("${sampleProperty1}")
    private String sampleProperty1;
    @Value("${sampleProperty2}")
    private String sampleProperty2;
    @Value("${samplePropertyInMultipleKeyVault}")
    private String samplePropertyInMultipleKeyVault;

    public static void main(String[] args) {
        SpringApplication.run(PropertySourceApplication.class, args);
    }

    public void run(String[] args) {
        System.out.println("sampleProperty1: " + sampleProperty1);
        System.out.println("sampleProperty2: " + sampleProperty2);
        System.out.println("samplePropertyInMultipleKeyVault: " + samplePropertyInMultipleKeyVault);
    }

}
