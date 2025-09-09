package org.example.g3_behavioral.p3_Template_Method;

/**
 * Beverage - напиток
 */
public abstract class AbstractBeveragePreparation {

    /**
     * Шаблонный метод, описывающий общие шаги алгоритма
     */
    public final void prepareBeverage() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    // Общие шаги
    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup"); //Налить в чашку
    }

    // Шаги, которые должны быть реализованы в подклассах
    protected abstract void brew(); //Заваривать

    protected abstract void addCondiments();
}

