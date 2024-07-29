package com.example.customerfrontthyemleafapp;

import com.example.customerfrontthyemleafapp.entities.Customer;
import com.example.customerfrontthyemleafapp.reporsitory.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerFrontThyemleafAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerFrontThyemleafAppApplication.class, args);

    }
    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return  args -> {

            customerRepository.save(Customer.builder().name("Ahmed").email("Ahmed@gmail.com").build());
            customerRepository.save(Customer.builder().name("Laila").email("Laila@gmail.com").build());
            customerRepository.save(Customer.builder().name("Ismael").email("Ismael@gmail.com").build());
        };
    }

}
