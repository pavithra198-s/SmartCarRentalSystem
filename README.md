# 🚗 Smart Car Rental System

> A web-based real-time car rental management application developed using **Java and Spring Boot**, designed to provide a structured and user-friendly car rental experience.

---

## 📌 Project Overview

The **Smart Car Rental System** is a web-based application that simplifies the process of renting cars through a step-by-step booking workflow.

The system allows users to provide their rental requirements, enter personal and location details, explore available cars, select a suitable vehicle, and complete the rental process.

The project is designed as an **application-based system rather than a console application**, with a focus on providing a realistic digital car rental experience.

---

## 🎯 Objectives

The main objectives of this project are:

* 🚘 Provide a digital platform for car rental.
* 👤 Collect customer information through a structured workflow.
* 📍 Capture rental location and destination details.
* 🚗 Display multiple available car options.
* 💰 Present rental-related pricing information.
* 📷 Allow customers to upload car condition evidence.
* 🎥 Support photo/video evidence during the vehicle inspection stage.
* 🔄 Maintain a structured rental process from booking to reporting.
* ⭐ Provide a review stage after completing the rental.
* 🖥️ Provide a modern and responsive web interface.

---

# 🔄 Application Workflow

The application follows a structured multi-step rental process.

### Step 1 — Rental Option

The customer selects the required rental option.

Possible rental modes include:

* 🚘 Car Only — Self Driving
* 👨‍✈️ Car + Assigned Driver
* 👤 Car + Own Driver
* 👩‍✈️ Women Driver Option

This allows the rental process to adapt to different customer requirements.

---

### Step 2 — Customer & Location Details

The customer provides the required information such as:

* Customer details
* Number of members/passengers
* Current location
* Destination
* Rental-related information

The selected location is carried forward into the following stages of the application.

---

### Step 3 — Car Selection

The system presents multiple car options based on the rental requirements.

Car information can include:

* Car name
* Car category
* Seating capacity
* Fuel type
* Transmission
* Rental price
* Availability
* Car image

The customer can select the vehicle that best matches their requirements.

---

### Step 4 — Car Details & Estimated Cost

After selecting a vehicle, the customer can view relevant rental information and estimated charges.

The system can consider rental-related factors such as:

* Car rental charges
* Driver charges where applicable
* Fuel-related cost
* Toll-related cost
* Trip information

This provides the customer with a clearer understanding of the expected rental cost.

---

### Step 5 — Vehicle Inspection

A major feature of the application is the vehicle inspection stage.

Before using the vehicle, the customer can provide visual evidence of the vehicle's condition.

The system supports:

📷 **Photo Upload**

🎥 **Video Upload**

This can help document visible vehicle conditions before the rental.

The uploaded evidence can be used as a reference during the rental lifecycle.

---

### Step 6 — Rental Journey

After completing the required booking and inspection information, the customer proceeds with the rental journey.

The selected car and rental details are maintained throughout the workflow.

---

### Step 7 — Reporting

After the rental process, the customer can report relevant issues related to the vehicle.

This stage can help document problems identified after usage.

The reporting workflow is designed to improve transparency between the customer and rental service.

After submitting a report, the application redirects the user back to the **Home Page**.

---

### Step 8 — Customer Review

The final stage allows the customer to provide feedback about their rental experience.

This can include:

* ⭐ Rating
* 💬 Review
* Customer feedback

The review stage provides a way to collect customer experience information.

---

# 🏗️ System Architecture

The application follows a layered Spring Boot architecture.

```text
                    ┌─────────────────────────┐
                    │       Web Browser       │
                    │   Customer Interface    │
                    └────────────┬────────────┘
                                 │
                                 ▼
                    ┌─────────────────────────┐
                    │       Controller        │
                    │    Request Handling     │
                    └────────────┬────────────┘
                                 │
                                 ▼
                    ┌─────────────────────────┐
                    │        Service          │
                    │    Business Logic       │
                    └────────────┬────────────┘
                                 │
                                 ▼
                    ┌─────────────────────────┐
                    │       Repository        │
                    │     Data Handling       │
                    └────────────┬────────────┘
                                 │
                                 ▼
                    ┌─────────────────────────┐
                    │       Data Storage      │
                    └─────────────────────────┘
```

---

# 🛠️ Technology Stack

## Backend

* ☕ Java
* 🌱 Spring Boot
* 🌐 Spring MVC
* 📦 Maven

## Frontend

* HTML5
* CSS3
* JavaScript
* Thymeleaf

## Database / Data Storage

* Application data storage
* Rental-related records
* Customer information
* Vehicle information
* Uploaded inspection files

## Development Environment

* IntelliJ IDEA
* JDK
* Maven
* Git
* GitHub

---

# 📁 Project Structure

The project is organized using a Spring Boot structure similar to:

```text
SmartCarRental/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── carrental/
│       │           └── smartcarrental/
│       │               │
│       │               ├── controller/
│       │               ├── model/
│       │               ├── repository/
│       │               ├── service/
│       │               │
│       │               └── SmartCarRentalApplication.java
│       │
│       └── resources/
│           ├── templates/
│           ├── static/
│           │   ├── css/
│           │   ├── js/
│           │   └── images/
│           │
│           └── application.properties
│
├── data/
│
├── uploads/
│
├── pom.xml
│
├── README.md
│
└── .gitignore
```

---

# 🚘 Key Features

### 1. Multi-Step Rental Workflow

The application divides the rental process into logical stages instead of presenting everything on a single page.

### 2. Multiple Rental Options

Customers can choose different combinations of car and driver requirements.

### 3. Location-Based Rental Details

Customer location and destination information are collected during the booking process and carried forward through the rental workflow.

### 4. Multiple Vehicle Suggestions

The car selection stage provides multiple vehicle choices instead of restricting the customer to a single car.

### 5. Vehicle Inspection

The system includes a dedicated inspection stage where customers can document the vehicle condition.

### 6. Photo & Video Upload

Customers can upload visual evidence such as:

* Vehicle photographs
* Vehicle videos

This is particularly useful for documenting visible damage or vehicle condition.

### 7. Rental Cost Information

The application presents rental-related charges and trip cost information.

### 8. Reporting System

Customers can report issues after using the vehicle.

### 9. Home Page Redirection

After submitting a report, the application returns the customer to the home page.

### 10. Customer Review

The final stage provides a customer feedback and review mechanism.

---

# 📸 Vehicle Inspection Concept

One of the important aspects of this project is maintaining evidence of the vehicle condition.

The basic workflow is:

```text
Vehicle Before Rental
        │
        ▼
Customer Inspection
        │
        ├── 📷 Photos
        │
        └── 🎥 Video
        │
        ▼
Rental Journey
        │
        ▼
Vehicle Return
        │
        ▼
Issue Reporting
        │
        ▼
Customer Review
```

This concept can help reduce misunderstandings regarding visible vehicle damage.

---

# 🔐 Data & File Handling

The application includes dedicated locations for storing application data and uploaded files.

```text
data/
   └── Application Data

uploads/
   └── Customer Uploaded Files
```

Uploaded inspection files can be used as supporting evidence during the rental process.

---

# 💡 Why This Project Is Useful

Traditional rental processes can involve manual communication, paperwork, and uncertainty regarding vehicle condition.

This project attempts to organize the rental process digitally.

The application brings together:

**Customer Details**

⬇️

**Location**

⬇️

**Car Selection**

⬇️

**Cost Information**

⬇️

**Vehicle Inspection**

⬇️

**Rental**

⬇️

**Reporting**

⬇️

**Review**

into one structured web application.

---

# 🌟 Real-World Use
