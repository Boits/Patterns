package org.example.g3_behavioral.p1_Command.command;

public interface Command {
    void execute(); // Выполнить команду

    void cancel();    // Отменить команду
}
