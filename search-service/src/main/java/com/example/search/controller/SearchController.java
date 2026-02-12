package com.example.search.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.search.service.SearchService;
import com.example.search.model.Product;


@RestController
@RequestMapping("/api/search")
public class SearchController {

    @Autowired
    private SearchService service;   

    @GetMapping("/affordable")
    public List<String> getAffordableProducts() {
        return service.getAffordableProducts();
    }
    
    @GetMapping("/affordable/details")
    public List<Product> getAffordableProductDetails() {
        return service.getAffordableProductDetails();
    }

}
