package org.example.g1_creational.p1_Builder;

public record House(// Обязательные параметры
                    String foundation, String walls, String roof,
                    //Необязательные параметры
                    boolean hasGarage, boolean hasSwimmingPool, boolean hasGarden, int numberOfFloors) {

    // Приватный конструктор
    private House(Builder builder) {
        this(builder.foundation, builder.walls, builder.roof,
                builder.hasGarage, builder.hasSwimmingPool, builder.hasGarden, builder.numberOfFloors);
    }

    // Статический внутренний класс Builder
    public static class Builder {
        // Обязательные параметры
        private final String foundation;
        private final String walls;
        private final String roof;

        // Необязательные параметры
        private boolean hasGarage;
        private boolean hasSwimmingPool;
        private boolean hasGarden;
        private int numberOfFloors;

        // Конструктор для обязательных параметров
        public Builder(String foundation, String walls, String roof) {
            this.foundation = foundation;
            this.walls = walls;
            this.roof = roof;
        }

        // Методы для установки необязательных параметров
        public Builder setGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public Builder setSwimmingPool(boolean hasSwimmingPool) {
            this.hasSwimmingPool = hasSwimmingPool;
            return this;
        }

        public Builder setGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public Builder setNumberOfFloors(int numberOfFloors) {
            this.numberOfFloors = numberOfFloors;
            return this;
        }

        // Метод для создания объекта House
        public House build() {
            return new House(this);
        }
    }

      //при record не обязательно
//    @Override
//    public String toString() {
//        return "House [foundation=" + foundation + ", walls=" + walls + ", roof=" + roof +
//                ", hasGarage=" + hasGarage + ", hasSwimmingPool=" + hasSwimmingPool +
//                ", hasGarden=" + hasGarden +
//                ", numberOfFloors=" + numberOfFloors + "]";
//    }
}

