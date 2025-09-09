package org.example.g2_structural.p1_Decorator;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ClubbedTrollDecorator implements Troll {

    private final Troll decorator;

    @Override
    public void attack() {
        decorator.attack();
        System.out.println("The troll swings at you with a club!");
    }

    @Override
    public int getAttackPower() {
        return decorator.getAttackPower() + 10;
    }

}