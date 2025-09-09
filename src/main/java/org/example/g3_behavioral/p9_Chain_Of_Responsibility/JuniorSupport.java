package org.example.g3_behavioral.p9_Chain_Of_Responsibility;

/**
 * Обработчик для начального уровня - 1
 */
public class JuniorSupport extends SupportHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("basic")) {
            System.out.println("Junior Support: Handling basic request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
