# multi-tenant-bootstrap-system
# 🚀 Multi-Tenant SaaS Foundation

A multi-tenant microservices system featuring a reusable tenant loader library.  
It initializes tenants at application startup by integrating with a REST-based tenant service and follows clean architecture principles for scalable SaaS applications.

---

## 🧩 Architecture Overview

This project consists of three main components:

---

## ⚙️ Modules

### 📦 library
Reusable Java library responsible for:
- Fetching tenants from tenant-service
- Loading tenants at application startup
- Providing in-memory access to tenants

---

### 🌐 tenant-service
- REST API to manage tenants
- Acts as the source of truth

Example endpoint:
GET /tenants

---

### 🧠 tenant-consumer-service
- Uses the tenant-library
- Loads tenants at startup
- Exposes APIs to access tenant data

---


Test API
GET http://localhost:9090/tenants

## 📸 Screenshots
<img width="2310" height="503" alt="Screenshot 2026-04-26 190740" src="https://github.com/user-attachments/assets/a3f92390-0e8e-4963-a6aa-655ff93043c2" />

<img width="2017" height="779" alt="image" src="https://github.com/user-attachments/assets/2182df3e-6773-4a01-8696-0209615fefd9" />
