package org.example.g3_behavioral.p3_Template_Method;

public class TemplateMethodApp {

    public static void call() {
        System.out.println("Coffee: ");
        AbstractBeveragePreparation coffee = new CoffeePreparation();
        coffee.prepareBeverage();

        System.out.println("Tea: ");
        AbstractBeveragePreparation tea = new TeaPreparation();
        tea.prepareBeverage();
    }
}
