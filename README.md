# Weather Station System
This project demonstrates the Observer Pattern in Java, applied to a Weather Station System. The Observer Pattern allows an object (the subject) to notify other objects (the observers) of any changes in its state without needing to tightly couple the objects.

Key Features:
Subject (WeatherStation): Keeps track of temperature and notifies observers (display devices) when the temperature changes.
Observers (DisplayDevice): Subscribed to the weather station for updates. They get notified automatically when the weather station updates its temperature.
Design Pattern Used:
Observer Pattern - This pattern is used to notify multiple objects when the state of another object changes. The subject (WeatherStation) maintains a list of observers (DisplayDevices) and informs them of any state changes (temperature changes).

Project Structure
The code is structured into the following files:

Observable.java - This is the abstract class for the subject. It provides methods to add, remove, and notify observers.
Observer.java - This interface defines the update() method that observers must implement.
WeatherStation.java - This concrete class extends Observable and represents the weather station. It holds the temperature state.
DisplayDevice.java - This concrete class implements Observer and represents the display devices that show temperature updates.
Main.java - This file tests the functionality by creating a weather station and two display devices.
How It Works:
The WeatherStation is the subject that stores the temperature.
DisplayDevice objects subscribe to the WeatherStation to receive temperature updates.
Whenever the temperature in the WeatherStation changes, it automatically notifies all registered DisplayDevice objects, and they display the updated temperature.
