package org.example.g3_behavioral.p6_Mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator {
    private final List<User> users = new ArrayList<>();

    @Override
    public void sendMessage(String message, User user) {
        users.stream()
                .filter(u -> !user.equals(u))
                .forEach(u -> u.receive(message));
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
