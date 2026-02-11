#  Search & Inventory Microservices

This project contains two independent services:

*  **Inventory Service** – Stores and exposes product data
*  **Search Service** – Fetches products from Inventory Service and filters items priced under $50

---

##  Tech Stack

* Java 8+
* Spring Boot 3+
* Spring Data JPA
* H2 In-Memory Database
* REST APIs
* Maven
* Microservices Architecture

---

##  Project Structure

```
Assignment_apptware/
│
├── inventory-service/
│   ├── src/main/java/com/example/inventory/
│   └── pom.xml
│
├── search-service/
│   ├── src/main/java/com/example/search/
│   └── pom.xml
│
└── README.md
```

---

#  Getting Started

##  Prerequisites

Make sure you have:

* Java 17 or higher
* Maven
* Git
* IDE (Eclipse / IntelliJ recommended)

---

#  Running the Project Locally

---

##  Clone the Repository

```bash
git clone https://github.com/Prathameshdhok/Assignment_apptware.git
cd Assignment_apptware
```

---

#  Run Inventory Service

### Step 1: Navigate to Inventory Service

```bash
cd inventory-service
```

### Step 2: Run the Application

Using Maven:

```bash
mvn spring-boot:run
```

Or run `InventoryServiceApplication` from your IDE.

### Step 3: Verify the Service

Open in browser:

```
http://localhost:9090/api/products
```

Expected Response:

```json
[
  {"id":1,"name":"Laptop","price":800.0},
  {"id":2,"name":"Mouse","price":20.0},
  {"id":3,"name":"Keyboard","price":45.0},
  {"id":4,"name":"Monitor","price":150.0}
]
```

---

#  Run Search Service

### Step 1: Navigate to Search Service

```bash
cd ../search-service
```

### Step 2: Run the Application

```bash
mvn spring-boot:run
```

Or run `SearchServiceApplication` from your IDE.

### Step 3: Verify the Service

Open in browser:

```
http://localhost:9091/api/search/affordable
```

Expected Response:

```json
["Keyboard","Mouse"]
```

---

#  How It Works

1. Inventory Service initializes product data in H2 in-memory database.
2. Search Service calls Inventory Service via REST API.
3. Products priced under $50 are filtered using Java Stream API.
4. The result is sorted and returned as a list of product names.

---

---

#  Ports Used

| Service           | Port |
| ----------------- | ---- |
| Inventory Service | 9090 |
| Search Service    | 9091 |

---
