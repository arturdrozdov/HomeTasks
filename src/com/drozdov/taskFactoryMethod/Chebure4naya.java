package com.drozdov.taskFactoryMethod;

public class Chebure4naya {
    public Cheburek getCheburek(CheburekType type) {
        Cheburek toReturn = null;
        switch (type) {
            case MEAT -> toReturn = new CheburekWithMeat();
            case CHEESE -> toReturn = new CheburekWithCheese();
            case SBORNIY -> toReturn = new CheburekSborniy();
            default -> System.out.println("Такого чебуречка не существует!");
        }
        return toReturn;
    }
}
