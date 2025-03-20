# 🚀 REST API CRUD Operations

## 📌 About the Project
This is a **Spring Boot REST API** that performs CRUD (Create, Read, Update, Delete) operations on a `Worker` entity. The project is built using **Spring Boot, JPA, and an H2/SQL database**.

## ✨ Features
✅ Create a new worker 🆕<br>
✅ Retrieve all workers 📜<br>
✅ Fetch a worker by ID 🔍<br>
✅ Update worker details ✏️<br>
✅ Delete a worker 🗑️<br>
✅ Handles exceptions with custom messages 🚨

---

## 📦 Tech Stack
- **Spring Boot** 🌱
- **Spring Data JPA** 🗄️
- **H2/SQL Database** 🛢️
- **Maven** 🏗️

---

## 🚀 Getting Started

### 📂 Clone the Repository
```bash
 git clone https://github.com/MdArman09/REST-API-CRUD.git
 cd REST-API-CRUD
```

### 🛠️ Setup & Run the Application
1️⃣ Open the project in **IntelliJ IDEA** or any preferred IDE.
2️⃣ Configure the database in `application.properties` (H2/SQL).
3️⃣ Run the application:
```bash
mvn spring-boot:run
```

---

## 🔥 API Endpoints

| Method | Endpoint         | Description |
|--------|----------------|-------------|
| **POST**   | `/worker/abc`    | Create a new worker 🆕 |
| **GET**    | `/worker/get`    | Get all workers 📜 |
| **GET**    | `/worker/{id}`   | Get a worker by ID 🔍 |
| **PUT**    | `/worker/{id}`   | Update a worker ✏️ |
| **DELETE** | `/worker/{id}`   | Delete a worker 🗑️ |

---

## ⚡ Example Usage
### 1️⃣ Create a New Worker
**Request:**
```json
POST /worker/abc
{
  "worker_id": 1,
  "name": "John Doe",
  "address": "123 Street, City",
  "salary": 50000
}
```
**Response:**
```json
{
  "worker_id": 1,
  "name": "John Doe",
  "address": "123 Street, City",
  "salary": 50000
}
```

### 2️⃣ Retrieve All Workers
```json
GET /worker/get
```

### 3️⃣ Fetch a Worker by ID
```json
GET /worker/1
```

### 4️⃣ Update a Worker
```json
PUT /worker/1
{
  "name": "Jane Doe",
  "address": "456 Avenue, City",
  "salary": 60000
}
```

### 5️⃣ Delete a Worker
```json
DELETE /worker/1
```

---

## 🎯 Future Enhancements
🔹 Implement authentication & authorization 🔐<br>
🔹 Add pagination & sorting 📌<br>
🔹 Improve exception handling 🛑

---

## 🙌 Contributing
Feel free to contribute by creating issues or pull requests! 🎉

---

## 📞 Contact
👤 **Md Arman Alam**  
📧 Email: [md4577963@gmail.com](mailto:md45577963@gmail.com)  
🔗 GitHub: [MdArman09](https://github.com/MdArman09)

---

**⭐ If you like this project, give it a star on GitHub!** 🌟

