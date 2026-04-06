# HeartGuard - Heart Rate Monitoring & Prediction App

## 📌 Overview

**HeartGuard** is a mobile application designed to monitor heart rate data and predict potential heart disease risks using machine learning models.

The app helps users track their health, detect abnormalities early, and manage medical appointments efficiently.

---
## 🎥 Demo
[Watch Demo Video](https://drive.google.com/drive/folders/13DQRLK6LZ79PeBUHe1kx36n4O5W0Kfdw)
## 🤖 Backend Deployment
[Base URL](https://github.com/LuuYenVy/Heart-AI-API)

---

## 🚀 Features

* 📊 Real-time heart rate tracking
* 🤖 Heart disease risk prediction using AI
* 📅 Appointment scheduling and management
* 🔔 Abnormal heart rate alerts
* 🔐 User authentication (Firebase Auth)
* ☁️ Cloud data storage (Firebase Realtime Database)

---

## 🛠 Tech Stack

### 📱 Mobile

* Android (Java)
* MVVM Architecture
* ViewModel + LiveData

### 🔥 Backend & Cloud

* Firebase Realtime Database
* Firebase Authentication

### 🤖 AI / Backend API

* Python (FastAPI)
* RESTful API
* OpenAI API (AI chatbot for personalized health advice)

### 🧰 Tools

* Android Studio
* Postman
* Git & GitHub

---

## 🏗 Architecture

The application is built using **MVVM (Model - View - ViewModel)** combined with the **Repository pattern**.

### 🔄 Data Flow

User Interaction (UI)
→ ViewModel (handles UI logic & state)
→ Repository (single source of truth)
→ Data Sources:

* Firebase Realtime Database (user data, appointments)
* FastAPI Backend (ML prediction API)

### 🧩 Components

* **View (Activity/Fragment)**
  Handles UI rendering and user interactions

* **ViewModel**
  Manages UI-related data using LiveData and survives configuration changes

* **Repository**
  Abstracts data sources and provides clean API for ViewModel

* **Data Sources**

  * Firebase: stores user data in real-time
  * Backend API: processes heart rate data and returns prediction results

### 📌 Key Benefits

* Separation of concerns
* Easier testing and maintenance
* Scalable architecture for future features

---

## 📷 Screenshots

<p align="center">
  <img src="https://github.com/user-attachments/assets/2a07b750-20ad-4d37-bafc-b4868e1f46ee" width="22%">
  <img src="https://github.com/user-attachments/assets/01969e82-0ec1-42d0-96d9-210107484dd8" width="22%">
  <img src="https://github.com/user-attachments/assets/7e4d8f91-1141-4e67-9840-a2da3bac8166" width="22%">
  <img src="https://github.com/user-attachments/assets/62f8f0c2-d1e8-4c1f-9adb-62a1c617378f" width="22%">
</p>
<p align="center"><i>Login • Chart • Appointment Manager • AI Assistant</i></p>

---

## ⚙️ Installation

### 1. Clone repository

```bash
git clone https://github.com/your-username/heartguard.git
```

### 2. Open project

* Open with **Android Studio**

### 3. Firebase setup

* Add your `google-services.json` file to:

```
app/
```

### 4. Run backend (FastAPI)

```bash
cd backend
python -m venv venv
source venv/Scripts/activate
pip install -r requirements.txt
python -m uvicorn main:app --reload
```

---

## 🔌 API Documentation

### POST `/predict`

#### Request

```json
{
  "heartRate": [72, 75, 80, 78],
  "age": 25
}
```

#### Response

```json
{
  "risk": "low"
}
```

---


## 🧪 Testing

* Manual testing on Android device/emulator
* API testing using Postman

---

## 📌 Future Improvements

* ⏳ Integrate wearable devices (smartwatch, IoT)
* 📈 Improve ML model accuracy
* ☁️ Deploy backend to cloud (AWS / Render / Railway)
* 📊 Advanced data visualization dashboard

---


## ⭐ Acknowledgements

This project is developed for learning purposes in:

* Mobile Development
* Machine Learning Integration

---

## 💡 Notes

This project demonstrates a combination of:

* Mobile App Development (Android)
* Backend API Development
* Data-driven health prediction

---

⭐ If you find this project useful, feel free to give it a star!
