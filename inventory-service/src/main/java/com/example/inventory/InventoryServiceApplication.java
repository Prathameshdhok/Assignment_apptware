package com.example.inventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;

import com.example.inventory.repository.ProductRepository;
import com.example.inventory.model.Product;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }
    
    @Bean
    CommandLineRunner init(ProductRepository repository) {
        return args -> {
            repository.save(new Product(null, "Laptop", 800));
            repository.save(new Product(null, "Mouse", 20));
            repository.save(new Product(null, "Keyboard", 45));
            repository.save(new Product(null, "Monitor", 150));
        };
    }
}
