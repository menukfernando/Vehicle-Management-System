# Vehicle Management System

## Overview
The **Vehicle Management System** is designed to manage the fleet of vehicles for a company. The system allows handling different types of vehicles such as cars, motorcycles, and trucks, each with specific characteristics and behaviors. The system is flexible enough to accommodate new vehicle types in the future.

## Features
- All vehicles in the system can start and stop their engines, ensuring consistent behavior across all vehicle types.
- Each vehicle shares common attributes such as `make`, `model`, and `year`, which are securely encapsulated.
- The system supports three primary vehicle types:
  - **Cars**: Each car has a specific number of doors.
  - **Motorcycles**: Each motorcycle has an engine capacity measured in cubic centimeters (cc).
  - **Trucks**: Each truck has a payload capacity, indicating how much weight it can carry.

- Unique behaviors are exhibited by different vehicle types when starting and stopping their engines.
- The system stores and manages all vehicles in a centralized location, allowing for seamless handling, retrieval, and manipulation of vehicle information.
- The system demonstrates polymorphism by allowing all vehicles to be managed through the same interface, ensuring flexibility and scalability.

## System Requirements
- Each vehicle in the system must:
  - Start its engine.
  - Stop its engine.

- Each vehicle type has its own specific behavior for these actions:
  - Cars, Motorcycles, and Trucks should behave differently when starting and stopping.
  
- The system should be designed with flexibility in mind to accommodate new vehicle types in the future easily.

## Conclusion

The Vehicle Management System is a flexible and scalable solution that meets the company’s requirements for managing a diverse fleet of vehicles. With encapsulated attributes, polymorphic behavior, and centralized vehicle management, the system is well-suited for expansion in the future.
