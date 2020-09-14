package com.drozdov.taskOOP.company.details;

public class Engine {
   public double pow;
   public String manufact;

    public Engine(double pow, String manufact) {
        this.pow = pow;
        this.manufact = manufact;
    }
    public void printEngineInfo() {
        System.out.println(pow+manufact);
    }
}

