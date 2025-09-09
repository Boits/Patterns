package org.example.g3_behavioral.p9_Chain_Of_Responsibility;

/**
 * Обработчик для высшего уровня - 3
 */
public class ManagerSupport extends SupportHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("advanced")) {
            System.out.println("Manager Support: Handling advanced request.");
        } else {
            System.out.println("Manager Support: No handler for this request.");
        }
    }
}
