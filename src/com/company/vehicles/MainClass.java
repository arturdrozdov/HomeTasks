package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class MainClass extends Car {


    public static void main(String[] args) {
        Engine engine1 = new Engine(220, " BMW");
        Driver driver1 = new Driver("Drozdov Artur Olegovich ", 10);
        Car car1 = new Car("BMW", 'C', 1400,engine1,driver1);
//        Car car2 = new Car("Audi",'r',1234,engine1,driver1);
//        car1.printCarInfo();
//        car2.printCarInfo();
//        engine1.printEngineInfo();
//        driver1.printDriverInfo();
//        car1.stop();
        car1.printTotalInfo();

        }
    }


