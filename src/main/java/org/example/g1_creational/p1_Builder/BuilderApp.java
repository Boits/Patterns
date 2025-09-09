package org.example.g1_creational.p1_Builder;

public class BuilderApp {

    public static void call() {
        // Создание объекта с помощью Builder
        House house = new House.Builder("Concrete", "Brick", "Tile")
                .setGarage(true)
                .setNumberOfFloors(2)
                .build();

        System.out.println(house);
    }
}
