package com.example.search.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.search.service.SearchService;

@RestController
@RequestMapping("/api/search")
public class SearchController {

    @Autowired
    private SearchService service;   

    @GetMapping("/affordable")
    public List<String> getAffordableProducts() {
        return service.getAffordableProducts();
    }
}
