# SmartCarRental — Real-Time Car Rental System

A Spring Boot + Thymeleaf + JPA application implementing the fixed 8-step rental journey.

## 8 steps
1. Rental type
2. Customer + pickup + destination details
3. Live car suggestions based on Step 2 pickup location
4. Car details + days + toll + fuel estimate
5. Before-trip photo/video inspection upload
6. Trip handover / completion
7. Return inspection and damage report
8. Customer review and booking completion

## Requested changes implemented
- Topic is SmartCarRental / Car Rental System.
- Step 5 supports multiple image/video uploads and stores them in `uploads/`.
- Step 2 pickup location is stored in session and directly controls Step 3 car suggestions.
- Step 3 shows many cars across several real vehicle categories.
- Step 7 report submission continues to Step 8; the separate `/report` route returns directly to Home.
- Light, modern visual theme with a soft mint/cream palette.
- Real car photography is loaded from Unsplash image URLs.
- Completed bookings are persisted in an H2 file database under `data/`.

## Run in IntelliJ
1. Extract the ZIP.
2. Open the `SmartCarRental` folder in IntelliJ IDEA.
3. Wait for Maven dependencies to finish loading.
4. Open `src/main/java/com/carrental/smartcarrental/SmartCarRentalApplication.java`.
5. Click the green Run triangle.
6. Open `http://localhost:8080/` in Chrome.

Java 21+ is supported. Your Java 26 installation is also suitable for this project.

The project intentionally uses an H2 file database by default so it runs immediately without requiring a MySQL password. It can later be switched to MySQL.
