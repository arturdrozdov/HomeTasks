package com.company.professions;

public class Driver {
    public String fullName;
    public double drivingExperience;

    public Driver() {

    }

    public Driver(String fullName, double drivingExperience) {
        this.fullName = fullName;
        this.drivingExperience = drivingExperience;

    }
    public void printDriverInfo() {

        System.out.println(fullName+drivingExperience);
    }



}
