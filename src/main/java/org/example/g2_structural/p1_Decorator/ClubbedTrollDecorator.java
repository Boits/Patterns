package org.example.g2_structural.p1_Decorator;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ClubbedTrollDecorator implements Troll {

    private final Troll originalTroll;

    @Override
    public void attack() {
        originalTroll.attack();
        System.out.println("The troll swings at you with a club!");
    }

    @Override
    public int getAttackPower() {
        return originalTroll.getAttackPower() + 10;
    }

}