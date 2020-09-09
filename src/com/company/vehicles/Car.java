package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    public String carBrand;
    public char carClass;
    public double weight;
    public Engine engine;
    public Driver driver;

    public Car() {
    }

    public Car(String carBrand, char carClass, double weight, Engine engine, Driver driver) {
        this.carBrand = carBrand;
        this.carClass = carClass;
        this.weight = weight;
        this.engine = engine;
        this.driver = driver;
    }

    public void start() {
        System.out.println("Поехали!");
    }

    public void stop() {
        System.out.println("Останавливаемся!");
    }

    public void turnRight() {
        System.out.println("Поворот на право!");
    }

    public void turnLeft() {
        System.out.println("Поворот на лево!");
    }

    public void printCarInfo() {
        System.out.println(carBrand + " " + carClass + " " + weight + " ");
    }

    public void printTotalInfo() {
        printCarInfo();
        driver.printDriverInfo();
        engine.printEngineInfo();

    }
}