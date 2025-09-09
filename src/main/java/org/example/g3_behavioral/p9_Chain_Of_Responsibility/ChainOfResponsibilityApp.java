package org.example.g3_behavioral.p9_Chain_Of_Responsibility;

public class ChainOfResponsibilityApp {

    /**
     * У нас есть система обработки запросов на поддержку,
     * где запросы могут обрабатываться разными уровнями поддержки:
     * JuniorSupport 1, SeniorSupport 2 и ManagerSupport 3.
     */
    public static void call() {
        // Создание цепочки обработчиков
        SupportHandler junior = new JuniorSupport();
        SupportHandler senior = new SeniorSupport();
        SupportHandler manager = new ManagerSupport();

        junior.setNextHandler(senior);
        senior.setNextHandler(manager);

        // Обработка различных запросов
        junior.handleRequest("basic");      // Обработает Junior Support
        junior.handleRequest("intermediate"); // Обработает Senior Support
        junior.handleRequest("advanced");   // Обработает Manager Support
        junior.handleRequest("unknown");    // Не будет обработан
    }
}
