# 🔐 OAuth 2.0 Implementation with Spring Boot

This project demonstrates how to implement **OAuth 2.0 authentication** using **Spring Boot**. It allows users to securely log in via third-party providers (such as Google, GitHub, etc.) without sharing their credentials with the application.

---

## 📌 Features

- OAuth 2.0 Login with Spring Boot
- Integration with external providers (Google, GitHub, etc.)
- Secure authentication & authorization
- Access token handling
- User profile retrieval
- Protected REST APIs
- Session-based authentication (or JWT if implemented)
- Logout support

---

## 🛠️ Tech Stack

- **Backend:** Spring Boot
- **Security:** Spring Security + OAuth 2.0 Client
- **Build Tool:** Maven / Gradle
- **Language:** Java
- **Database:** MySQL / PostgreSQL / H2 (optional)

---

## ⚙️ OAuth Flow (Spring Boot)

1. User clicks **Login with Provider**
2. Spring Security redirects to OAuth provider
3. User authenticates and grants permission
4. Provider sends authorization code to backend
5. Spring Boot exchanges code for access token
6. Application fetches user details
7. User is authenticated in the system

---

## 🚀 Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/springboot-oauth.git
cd springboot-oauth
```

---

### 2. Configure OAuth Credentials

Update your application.yml:

spring:
  security:
    oauth2:
      client:
        registration:
          google:
            client-id: YOUR_CLIENT_ID
            client-secret: YOUR_CLIENT_SECRET
            scope:
              - email
              - profile

        provider:
          google:
            authorization-uri: https://accounts.google.com/o/oauth2/v2/auth
            token-uri: https://oauth2.googleapis.com/token
            user-info-uri: https://www.googleapis.com/oauth2/v3/userinfo
            
### Optional: GitHub Configuration
spring:
  security:
    oauth2:
      client:
        registration:
          github:
            client-id: YOUR_CLIENT_ID
            client-secret: YOUR_CLIENT_SECRET
            scope:
              - read:user
              - user:email

---

### Alternative: application.properties
spring.security.oauth2.client.registration.google.client-id=YOUR_CLIENT_ID
spring.security.oauth2.client.registration.google.client-secret=YOUR_CLIENT_SECRET
spring.security.oauth2.client.registration.google.scope=email,profile

---

### Access the Application
http://localhost:8080

---

### 📂 Project Structure

```
springboot-oauth/
│── src/main/java/com/example/oauth/
│   ├── config/
│   │   └── filterchain.java
│   ├── controller/
│   │   └── LoginController.java
│   ├── service/
│   ├── model/
│── src/main/resources/
│   ├── application.yml
│── pom.xml

```
