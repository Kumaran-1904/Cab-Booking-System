# 🚖 Cab Booking System – Java MVC Console Application

## 📌 Overview

The **Cab Booking System** is a modular, Java-based console application designed using the **MVC (Model-View-Controller)** architecture. It simulates an online cab reservation platform where admin and users can perform core operations such as user registration, ride booking, driver and vehicle management, payment processing, and feedback collection.

---

## 🧱 Project Architecture

The codebase is organized into clear layers following MVC principles:

```
CabBookingSystem/
├── Controller/      # Handles business logic and request routing
│   ├── UserController.java
│   ├── DriverController.java
│   ├── VehicleController.java
│   ├── BookingController.java
│   └── PaymentController.java
├── DAO/             # Data Access Objects (entity definitions)
│   ├── User.java
│   ├── Driver.java
│   ├── Vehicle.java
│   ├── Booking.java
│   ├── Payment.java
│   └── Admin.java
├── Model/           # In-memory databases and data collections
│   ├── UserDB.java
│   ├── DriverDB.java
│   ├── VehicleDB.java
│   ├── BookingDB.java
│   └── PaymentDB.java
├── View/            # Console-based user interfaces
│   ├── AdminView.java
│   └── MainView.java
├── main/            # Entry point
│   └── Main.java
└── README.md        # Project documentation
```

---

## 🎯 Key Features

- 👥 **User & Admin Management**
  - Register, view, and manage user profiles
  - Admin dashboard for overseeing bookings, payments, and drivers

- 🚕 **Cab Booking System**
  - Create and track ride bookings with pickup and drop-off locations
  - Booking status lifecycle: Pending → Confirmed → Completed → Cancelled

- 🚗 **Driver & Vehicle Assignment**
  - Assign available drivers and vehicles to new bookings
  - Maintain vehicle details (model, registration, capacity)

- 💳 **Payment Processing**
  - Simulate secure transactions via UPI, Cash, or Card
  - Track payment status and amounts

- ⭐ **Feedback Mechanism**
  - Collect user ratings and comments for completed rides

- 📋 **Console Interface**
  - Menu-driven navigation for admins and users
  - Clear prompts and input validation

---

## 🛠️ Technologies & Tools

- **Language:** Java (Core/JDK 8+)
- **Architecture:** MVC (Model-View-Controller)
- **Data Storage:** In-memory collections (no external DB)
- **Build & Run:** Any Java IDE or command-line `javac`/`java`

---

## 🚀 Getting Started

1. **Clone the repository**
   ```bash
   git clone https://github.com/your-username/cab-booking-system.git
   ```

2. **Navigate to the project folder**
   ```bash
   cd cab-booking-system
   ```

3. **Compile the source files**
   ```bash
   javac main/Main.java Controller/*.java DAO/*.java Model/*.java View/*.java
   ```

4. **Run the application**
   ```bash
   java main.Main
   ```

---

## 🎓 Learning Outcomes

- Apply MVC design pattern in Java applications
- Implement object-oriented principles (encapsulation, modularity)
- Develop console-based interfaces with user input handling
- Manage in-memory data operations without a database

---

## 📜 License

This project is licensed under the MIT License. Feel free to use, modify, and distribute for educational purposes.

---

## ❓ Contributions & Feedback

Contributions, issues, and feature requests are welcome! Feel free to open an issue or submit a pull request.

---

*Happy coding!* 🎉
