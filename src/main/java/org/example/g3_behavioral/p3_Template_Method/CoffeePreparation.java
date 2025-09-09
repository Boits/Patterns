package org.example.g3_behavioral.p3_Template_Method;

public class CoffeePreparation extends AbstractBeveragePreparation {

    @Override
    protected void brew() {
        System.out.println("Brewing coffee");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}

