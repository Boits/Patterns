package org.example.g3_behavioral.p1_Command;

import org.example.g3_behavioral.p1_Command.command.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * Инициатор (Invoker):
 * Отвечает за выполнение команды. Он хранит команду и может вызывать её выполнение.
 */
public class CommandManagerInvoker {
    private final List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void executeAllCommand() {
        commands.forEach(Command::execute);
    }

    // Отменить все команды в обратном порядке
    public void cancelAllCommand() {
        for (int i = commands.size() - 1; i >= 0; i--) {
            commands.get(i).cancel();
        }
    }
}
