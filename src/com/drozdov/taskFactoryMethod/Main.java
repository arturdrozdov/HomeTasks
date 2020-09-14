package com.drozdov.taskFactoryMethod;

public class Main {
    public static void main(String[] args) {
        Chebure4naya chebure4naya=new Chebure4naya();

        Cheburek cheese=chebure4naya.getCheburek(CheburekType.CHEESE);
        Cheburek meat=chebure4naya.getCheburek(CheburekType.MEAT);
        Cheburek sborniy=chebure4naya.getCheburek(CheburekType.SBORNIY);

        cheese.eat();
        meat.eat();
        sborniy.eat();
    }
}
