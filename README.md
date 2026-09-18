Hospital Management System using Java
1. Project Overview
The Hospital Management System (HMS) is a Java-based application designed to digitally manage common hospital activities and records. It provides a structured way to maintain patient details, doctor information, appointments, medical records, and billing information.
The project demonstrates important Object-Oriented Programming (OOP) and core Java concepts through a practical real-world application.
2. Objectives
Maintain patient records in an organized manner.
Manage doctor information.
Schedule and manage appointments.
Store basic medical-record information.
Generate and manage billing details.
Provide search, update, and delete operations.
Demonstrate core Java and OOP concepts in a real-world project.
3. Main Features
Patient registration
Doctor management
Appointment scheduling
Medical record management
Billing management
Search patient/doctor records
Update and delete records
Input validation and exception handling
Menu-driven interaction
4. Technologies Used
Programming Language: Java
Programming Concepts: OOP, inheritance, polymorphism, encapsulation, abstraction, exception handling, collections
Development Environment: VS Code / IntelliJ IDEA / Eclipse
Java Version: JDK 17 or later recommended
5. Java Concepts Demonstrated
Classes and Objects
Separate classes can represent entities such as `Patient`, `Doctor`, `Appointment`, and `Bill`.
Encapsulation
Private data members with public methods are used to control access to object data.
Inheritance
Common properties and behavior can be shared through parent and child classes.
Polymorphism
Parent-class references can be used to work with different child-class objects.
Abstraction
Essential operations are exposed while internal implementation details remain hidden.
Exception Handling
`try-catch` and suitable validation can be used to handle invalid input and runtime errors.
Collections
Java collections such as `ArrayList` can be used to store and manage multiple records dynamically.
6. Suggested Modules
Patient Module – add, view, search, update, and remove patient records.
Doctor Module – maintain doctor name, specialization, and availability.
Appointment Module – create and view appointments.
Medical Record Module – maintain diagnosis and treatment information.
Billing Module – calculate and display patient bills.
Main Menu – provides access to all modules.
7. Example Project Structure
```text
Hospital-Management-System/
│
├── src/
│   ├── Main.java
│   ├── Patient.java
│   ├── Doctor.java
│   ├── Appointment.java
│   ├── MedicalRecord.java
│   ├── Bill.java
│   └── HospitalManagementSystem.java
│
├── README.md
└── Project\_Report.pdf
```
8. How to Run
Install JDK 17 or later.
Clone or download the repository.
Open the project folder in VS Code, IntelliJ IDEA, or Eclipse.
Compile the Java source files.
Run `Main.java`.
Follow the menu displayed by the application.
Command-line example
```bash
javac src/\*.java
java -cp src Main
```
> The exact command may be adjusted depending on the final package structure.
9. Sample Workflow
```text
Hospital Management System
1. Patient Management
2. Doctor Management
3. Appointment Management
4. Medical Records
5. Billing
6. Exit

Enter your choice: 1

1. Add Patient
2. View Patients
3. Search Patient
4. Update Patient
5. Delete Patient
```
10. Advantages
Reduces dependence on manual records.
Makes information easier to search and update.
Organizes hospital-related data into separate modules.
Provides a practical demonstration of Java programming concepts.
11. Future Scope
Add a graphical user interface using Java Swing or JavaFX.
Connect the system to MySQL or another relational database.
Add login and role-based access for administrators, doctors, and staff.
Add automated appointment reminders.
Generate printable invoices and reports.
12. Conclusion
The Hospital Management System demonstrates how Java and Object-Oriented Programming can be applied to solve a practical record-management problem. The modular design makes the system easier to understand, maintain, and extend with additional functionality in the future.
13. Author
Name: Ashutosh Dubey
Course: Programming in Java  
Institution: VIT Bhopal University  
Project: Hospital Management System
