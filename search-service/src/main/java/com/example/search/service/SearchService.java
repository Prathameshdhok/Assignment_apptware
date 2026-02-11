package com.example.search.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.search.model.Product;

@Service
public class SearchService {

	@Autowired
    private RestTemplate restTemplate;

    private final String INVENTORY_URL =
            "http://localhost:9090/api/products";

    public List<String> getAffordableProducts() {

        Product[] products =
                restTemplate.getForObject(INVENTORY_URL, Product[].class);

        return Arrays.stream(products)
                .filter(p -> p.getPrice() < 50)
                .map(Product::getName)
                .sorted()
                .collect(Collectors.toList());
    }

	
}
