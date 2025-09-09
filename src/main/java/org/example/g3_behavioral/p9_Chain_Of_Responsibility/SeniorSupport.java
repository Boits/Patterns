package org.example.g3_behavioral.p9_Chain_Of_Responsibility;

/**
 * Обработчик для среднего уровня - 2
 */
public class SeniorSupport extends SupportHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("intermediate")) {
            System.out.println("Senior Support: Handling intermediate request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}