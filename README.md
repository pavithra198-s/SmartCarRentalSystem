# 🚗 Smart Car Rental System

A **real-time web-based Smart Car Rental System** developed using **Java, Spring Boot, HTML, CSS, JavaScript, and MySQL**. The system provides a practical digital workflow for customers to search for cars, select rental options, submit required documents, report vehicle condition, and complete the rental process.

The project is designed as an **application-based system rather than a console application**, with a user-friendly web interface and a structured multi-step rental workflow.

---

## 📌 Project Overview

Traditional car rental processes often involve manual paperwork, phone calls, physical vehicle inspections, and difficulty tracking vehicle conditions.

The **Smart Car Rental System** provides a digital solution where customers can:

* Select a rental type
* Enter personal and travel details
* Select pickup and destination locations
* View available cars
* Compare multiple car options
* View rental charges
* Upload driving/document verification files
* Upload photos and videos of the vehicle condition
* Report vehicle issues
* Complete the rental process
* Submit feedback after returning the vehicle

The system is designed with a focus on **real-world usability, transparency, safety, and digital record management**.

---

## 🎯 Objectives

The main objectives of the project are:

1. To develop a web-based car rental platform.
2. To simplify the vehicle booking process.
3. To provide multiple rental options.
4. To display multiple available cars based on rental requirements.
5. To maintain customer and booking information digitally.
6. To support document, photo, and video uploads.
7. To record the vehicle condition before and after rental.
8. To improve transparency between customers and vehicle owners.
9. To provide a structured rental workflow.
10. To create a scalable foundation for a real-world car rental application.

---

## 💡 Rental Options

The system provides four rental options:

### 1. 🚘 Self-Drive

The customer rents the car and drives it themselves.

The system can collect:

* Driving licence details
* Age/eligibility information
* Customer details
* Pickup location
* Destination
* Rental duration

---

### 2. 🚗 + 👨‍✈️ Car with Assigned Driver

The customer rents a car along with a driver assigned through the system.

The rental cost can include:

* Car rental charges
* Driver charges
* Fuel charges
* Toll charges
* Other applicable charges

---

### 3. 🚗 + 👤 Customer's Own Driver

The customer rents the vehicle but provides their own driver.

The system records the rental and journey details while the customer manages the driver.

---

### 4. 👩‍✈️ Women Driver Option

A dedicated option for customers who prefer a women driver.

This option is designed to provide an additional choice for customers who want a women-driver-based rental service.

---

# 🔄 System Workflow

The project follows a structured **8-step rental process**.

```text
Step 1
Rental Option
     ↓
Step 2
Customer & Location Details
     ↓
Step 3
Car Search & Suggestions
     ↓
Step 4
Car Details & Rental Cost
     ↓
Step 5
Before-Rental Vehicle Inspection
     ↓
Step 6
Journey / Rental Period
     ↓
Step 7
After-Rental Vehicle Inspection
     ↓
Step 8
Customer Review
```

---

## 🟢 Step 1 — Select Rental Option

The customer selects one of the available rental modes:

* Self Drive
* Car + Assigned Driver
* Car + Own Driver
* Women Driver

The selected option is maintained throughout the booking process.

---

## 🟢 Step 2 — Customer & Location Details

The customer enters:

* Name
* Phone number
* Email
* Number of passengers
* Pickup location
* Destination
* Rental date
* Return date

The selected location is carried forward to the next steps.

For example:

```text
Pickup Location:
Chennai

Destination:
Pondicherry
```

If the customer changes the location, the updated location is reflected in the subsequent car-search step.

---

## 🟢 Step 3 — Car Search & Suggestions

The system displays multiple available cars instead of showing only one vehicle.

Example:

| Car           | Category | Seats | Fuel   | Price/Day |
| ------------- | -------- | ----: | ------ | --------: |
| Toyota Innova | SUV      |     7 | Diesel |    ₹2,500 |
| Hyundai Creta | SUV      |     5 | Petrol |    ₹2,200 |
| Tata Nexon    | SUV      |     5 | Petrol |    ₹1,800 |
| Maruti Ertiga | MUV      |     7 | Petrol |    ₹2,000 |
| Kia Seltos    | SUV      |     5 | Petrol |    ₹2,300 |

The customer can select the car that best matches their requirements.

---

## 🟢 Step 4 — Car Details & Rental Cost

After selecting a vehicle, the system displays detailed information such as:

* Car name
* Model
* Fuel type
* Transmission
* Number of seats
* Rental price
* Rental duration
* Pickup location
* Destination
* Estimated fuel cost
* Estimated toll charges
* Driver charges where applicable
* Total estimated rental cost

### Example Cost Calculation

```text
Car Rental       = ₹2,500
Driver Charges   = ₹1,000
Fuel Estimate    = ₹1,500
Toll Estimate    = ₹500
--------------------------------
Estimated Total  = ₹5,500
```

The actual charges can depend on the rental duration, route, vehicle and selected service.

---

# 🟢 Step 5 — Before-Rental Vehicle Inspection

Before starting the journey, the customer can record the vehicle's existing condition.

The system supports uploading:

* 📷 Vehicle photos
* 🎥 Vehicle videos
* 📄 Supporting documents

Possible inspection areas include:

* Front side
* Rear side
* Left side
* Right side
* Interior
* Wheels
* Windows
* Existing scratches
* Existing dents

This creates a digital **Before-Rental Vehicle Condition Record**.

---

# 🟢 Step 6 — Journey / Rental Period

After completing the vehicle inspection, the customer proceeds with the rental.

The system maintains important rental information such as:

```text
Customer
Vehicle
Pickup Location
Destination
Rental Date
Return Date
Rental Type
Booking Information
```

This provides a structured record of the rental journey.

---

# 🟢 Step 7 — After-Rental Vehicle Inspection

After the vehicle is returned, another inspection can be performed.

The owner/operator can compare:

```text
BEFORE RENTAL
       ↓
Vehicle Condition
       ↓
AFTER RENTAL
       ↓
Vehicle Condition Comparison
```

The system can record:

* New scratches
* New dents
* Damaged parts
* Interior issues
* Missing items
* Other reported problems

This feature helps improve transparency between the customer and vehicle owner.

---

# 🟢 Step 8 — Customer Review

After completing the rental, the customer can submit feedback.

Possible review information includes:

* Overall rating
* Vehicle experience
* Driver experience
* Service experience
* Comments

Example:

```text
Rating: ⭐⭐⭐⭐⭐

Comment:
The vehicle was clean and the rental process was easy.
```

After submitting the review/report, the system returns the user to the **Home Page**.

---

# 🛡️ Vehicle Condition Management

One of the important features of this project is digital vehicle-condition tracking.

The system maintains two stages:

### Before Rental

```text
Customer
   ↓
Inspect Vehicle
   ↓
Upload Photos / Videos
   ↓
Record Existing Damage
```

### After Rental

```text
Vehicle Returned
   ↓
Owner Inspects Vehicle
   ↓
Upload Photos / Videos
   ↓
Record New Damage
   ↓
Compare Vehicle Condition
```

This provides a digital record that can help reduce misunderstandings about vehicle condition.

---

# 📁 File Upload System

The application supports uploading files such as:

* Driving licence/document images
* Vehicle photographs
* Vehicle videos
* Supporting verification files

Uploaded files are stored separately from the application source code.

Example:

```text
uploads/
```

The application can use these files during verification and vehicle-condition recording.

---

# 🖥️ User Interface

The application uses a modern web interface with:

* Responsive layouts
* Card-based car display
* Real vehicle images
* Multi-step navigation
* Location-based rental information
* File-upload components
* Vehicle inspection sections
* Rental cost display
* Review page
* Light-colour visual design

The goal is to make the system simple enough for customers to use without technical knowledge.

---

# 🧑‍💻 Technologies Used

## Backend

* Java
* Spring Boot
* Spring MVC

## Frontend

* HTML5
* CSS3
* JavaScript

## Database

* MySQL / relational database

## Build Tool

* Maven

## Development Environment

* IntelliJ IDEA

## Version Control

* Git
* GitHub

---

# 🏗️ Project Architecture

The project follows a layered application structure.

```text
SmartCarRental
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.carrental.smartcarrental
│   │   │       │
│   │   │       ├── controller
│   │   │       │
│   │   │       ├── model
│   │   │       │
│   │   │       ├── repository
│   │   │       │
│   │   │       ├── service
│   │   │       │
│   │   │       └── SmartCarRentalApplication.java
│   │   │
│   │   └── resources
│   │       ├── templates
│   │       ├── static
│   │       │   ├── css
│   │       │   ├── js
│   │       │   └── images
│   │       └── application.properties
│   │
│   └── test
│
├── data
│
├── uploads
│
├── pom.xml
│
├── .gitignore
│
└── README.md
```

---

# 🔧 Main Components

### Controller Layer

Handles web requests and navigation between different pages.

```text
Controller
    ↓
Receives User Request
    ↓
Processes Request
    ↓
Returns Web Page
```

### Model Layer

Represents application data such as:

* Customer
* Car
* Booking
* Driver
* Vehicle inspection
* Review

### Repository Layer

Responsible for communicating with the database.

### Service Layer

Contains application business logic such as:

* Car search
* Booking processing
* Cost calculation
* Vehicle inspection handling
* Review processing

---

# 🗄️ Data Management

The system can maintain information related to:

```text
Customer
    ↓
Booking
    ↓
Car
    ↓
Driver
    ↓
Vehicle Inspection
    ↓
Review
```

This allows rental information to be organized and retrieved systematically.

---

# 🚘 Real-World Use Cases

The system can be useful for:

* Car rental companies
* Travel agencies
* Local vehicle rental businesses
* Self-drive rental services
* Corporate vehicle rental
* Tourist transportation services
* Driver-assisted rental services

---

# 🔐 Security Considerations

For a production deployment, the application should include:

* User authentication
* Password encryption
* Role-based access control
* Secure file upload validation
* File size restrictions
* Allowed file-type validation
* Secure database access
* HTTPS
* Session management
* Protection against unauthorized access

---

# 💳 Future Payment Integration

A future version can integrate an online payment gateway.

Possible payment flow:

```text
Select Car
    ↓
Calculate Rental Cost
    ↓
Confirm Booking
    ↓
Payment Gateway
    ↓
Payment Verification
    ↓
Booking Confirmation
```

Possible payment methods can include:

* UPI
* Credit/Debit Card
* Net Banking
* Digital Wallets

---

# 📍 Future Location Integration

A production version can integrate mapping and location services to provide:

* GPS-based pickup location
* Destination selection
* Distance calculation
* Route estimation
* Estimated travel time
* Toll estimation
* Nearby available cars

---

# 🤖 Future Smart Features

The project can be extended with intelligent features such as:

### Smart Car Recommendation

Recommend vehicles based on:

* Number of passengers
* Budget
* Distance
* Vehicle category
* Fuel type
* Rental duration

### Damage Detection

Computer vision can be added to detect:

* Scratches
* Dents
* Broken parts
* Visible vehicle damage

### Dynamic Pricing

Rental prices could be calculated based on:

* Demand
* Rental duration
* Vehicle category
* Seasonal demand
* Availability

---

# 📱 Future Mobile Application

The web application can later be converted into a mobile application for:

* Android
* iOS

Customers could manage:

* Bookings
* Documents
* Vehicle inspections
* Payments
* Reviews

from their mobile devices.

---

# ▶️ How to Run the Project

## Prerequisites

Install:

* Java JDK
* IntelliJ IDEA
* Maven
* MySQL (if database integration is enabled)

---

## Step 1 — Clone the Repository

```bash
git clone https://github.com/pavithra198-s/SmartCarRentalSystem.git
```

---

## Step 2 — Open in IntelliJ IDEA

Open IntelliJ IDEA and select:

```text
File
→ Open
→ SmartCarRental
```

Open the folder containing:

```text
pom.xml
```

---

## Step 3 — Load Maven Dependencies

IntelliJ should automatically detect the Maven project.

If required:

```text
Maven
→ Reload Project
```

---

## Step 4 — Run the Application

Open:

```text
SmartCarRentalApplication.java
```

Click the green ▶ Run button.

The Spring Boot application should start on:

```text
http://localhost:8080
```

Open the address in a web browser.

---

# 🌐 Application Flow

```text
Home Page
     ↓
Select Rental Option
     ↓
Customer Details
     ↓
Location Details
     ↓
Search Available Cars
     ↓
Select Car
     ↓
View Car & Cost Details
     ↓
Upload Verification / Inspection Files
     ↓
Start Rental
     ↓
Return Vehicle
     ↓
After-Rental Inspection
     ↓
Submit Review
     ↓
Home Page
```

---

# 📊 Project Benefits

The system provides:

* Digital rental management
* Multiple vehicle choices
* Structured booking workflow
* Digital vehicle inspection
* Photo and video evidence
* Location-based rental information
* Transparent cost calculation
* Customer feedback
* Better record management
* Potential for payment integration
* Potential for intelligent vehicle recommendations

---

# 🚀 Future Scope

The project can be further enhanced with:

* Real-time GPS tracking
* Online payment gateway
* Email notifications
* SMS notifications
* OTP verification
* Driver verification
* Aadhaar/document verification through appropriate authorized services
* Digital rental agreements
* E-signatures
* Admin dashboard
* Owner dashboard
* Customer dashboard
* AI-based vehicle damage detection
* Smart car recommendations
* Dynamic pricing
* Mobile application
* Cloud deployment

---

# 📌 Project Status

**Current Status:** 🚧 Development / Academic Project

The application is being developed as a **real-time web-based Smart Car Rental System** with a focus on practical rental workflows, vehicle-condition tracking, customer usability, and future scalability.

---

# 👩‍💻 Developer

**PAVITHRA S**

Computer Science and Engineering

---

# 📜 License

This project is developed for **educational and academic purposes**.

If this project is extended for commercial use, appropriate licensing, data-protection, payment, mapping, document-verification, and other applicable legal requirements should be considered.

---

# ⭐ Acknowledgement

This project demonstrates the application of:

* Java programming
* Spring Boot
* Web development
* Database management
* Software architecture
* Git and GitHub
* Real-world applic
