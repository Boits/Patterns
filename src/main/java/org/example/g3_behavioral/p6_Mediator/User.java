package org.example.g3_behavioral.p6_Mediator;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class User {
    protected final ChatMediator mediator;
    protected final String name;

    public abstract void send(String message);
    public abstract void receive(String message);
}

