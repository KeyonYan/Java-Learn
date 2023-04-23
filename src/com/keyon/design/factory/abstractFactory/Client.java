package com.keyon.design.factory.abstractFactory;

public class Client {

    public static void main(String[] args) {
        System.out.println("Game start");

        AbstractFactory factory = new HumanFactory(1,1);

        Unit marine = factory.createLowUnit();
        marine.show(); // Marine show in (1, 1)
        Unit tank = factory.createMidUnit();
        tank.show(); // Tank show in (1, 1)
        Unit battleship = factory.createHighUnit();
        battleship.show(); // Battleship show in (1,1)

        marine.attack(); // Marine attack, attack: 6
        tank.attack(); // Tank attack, attack: 10
        battleship.attack(); // Battleship attack, attack: 25

        // AbstractFactory factory2 = new GodFactory(6,6);
        // AbstractFactory factory3 = new ZergFactory(9,9);
        // ...
    }
}
