//package org.example.g2_structural.p4_Facade.way1.difficult_system;
//
//import java.util.Arrays;
//
//public abstract class Worker {
//
//    public void turnOn() {
//        System.out.println(name() + " is turned on.");
//    }
//
//    public void turnOff() {
//        System.out.println(name() + " is turned off.");
//    }
//
//    private void action(Action action) {
//        switch (action) {
//            case TURN_ON -> turnOn();
//            case TURN_OFF -> turnOff();
//            case RUN -> run();
//            default -> System.out.println("Undefined action");
//        }
//    }
//
//    /**
//     * Perform actions.
//     */
//    public void action(Action... actions) {
//        Arrays.stream(actions)
//                .forEach(this::action);
//    }
//
//    public abstract void run();
//
//    public abstract String name();
//
//    enum Action {
//        TURN_ON, TURN_OFF, RUN
//    }
//}
