package org.example.g3_behavioral.p6_Mediator;

public interface ChatMediator {
    void sendMessage(String message, User user);

    void addUser(User user);
}
