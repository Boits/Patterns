package org.example.g3_behavioral.p3_Template_Method;

public class TeaPreparation extends AbstractBeveragePreparation {

    @Override
    protected void brew() {
        System.out.println("Brewing the tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon");
    }
}
