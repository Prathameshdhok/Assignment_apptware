# Assignment_apptware
Build a Search Service that calls an external Inventory Service to fetch a list of available products. Using the Java Stream API, filter the results to include only items priced under $50, and return only the product names as a sorted list.


# Search & Inventory Microservices

## 📌 Overview
This project demonstrates a simple microservices architecture using Spring Boot.

- Inventory Service exposes product data.
- Search Service consumes Inventory Service and filters products under $50 using Java Stream API.

## 🛠️ Tech Stack
- Java 17
- Spring Boot 3
- Spring Data JPA
- H2 Database
- REST APIs
- Microservices Architecture

## 🚀 Services

### Inventory Service
Runs on: http://localhost:9090  
Endpoint:
GET /api/products

### Search Service
Runs on: http://localhost:9091  
Endpoint:
GET /api/search/affordable

## 📦 How to Run

1. Start Inventory Service
2. Start Search Service
3. Access:

http://localhost:9091/api/search/affordable

## 🎯 Expected Output

["Keyboard","Mouse"]
