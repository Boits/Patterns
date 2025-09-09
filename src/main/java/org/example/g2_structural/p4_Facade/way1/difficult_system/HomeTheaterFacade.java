//package org.example.g2_structural.p4_Facade.way1.difficult_system;
//
//import lombok.RequiredArgsConstructor;
//import org.example.g2_structural.p4_Facade.way1.DVDPlayer;
//import org.example.g2_structural.p4_Facade.way1.SoundSystem;
//import org.example.g2_structural.p4_Facade.way1.TV;
//import org.example.g2_structural.p4_Facade.way1.difficult_system.Worker;
//
//import java.util.Collection;
//import java.util.List;
//
///**
// * Фасад для управления домашним кинотеатром
// */
//@RequiredArgsConstructor
//public class HomeTheaterFacade {
//
//    private final List<Worker> workers;
//
//    public HomeTheaterFacade() {
//        workers = List.of(
//                new TV(),
//                new SoundSystem(),
//                new DVDPlayer());
//    }
//
//    // Метод для запуска домашнего кинотеатра
//    public void watchMovie() {
//        System.out.println("Get ready to watch a movie...");
//        makeActions(workers, Worker.Action.TURN_ON, Worker.Action.RUN);
//    }
//
//    // Метод для завершения просмотра фильма
//    public void endMovie() {
//        System.out.println("Shutting down the home theater...");
//        makeActions(workers, Worker.Action.TURN_OFF);
//    }
//
//    private static void makeActions(Collection<Worker> workers, Worker.Action... actions) {
//        workers.forEach(worker -> worker.action(actions));
//    }
//}
