package org.example.g2_structural.p1_Decorator;

public class DecoratorApp {

    public static void call() {
        Troll troll = new SimpleTroll();
        troll.attack();
        System.out.println("Simple troll power: " + troll.getAttackPower());

        System.out.println("============");

        // change the behavior of the simple troll by adding a decorator
        Troll clubbedTroll = new ClubbedTrollDecorator(troll);
        clubbedTroll.attack();
        System.out.println("Clubbed troll power: " + clubbedTroll.getAttackPower());
    }
}
