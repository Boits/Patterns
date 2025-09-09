package org.example.g3_behavioral.p1_Command;

import org.example.g3_behavioral.p1_Command.command.Command;
import org.example.g3_behavioral.p1_Command.command.LightOffCommand;
import org.example.g3_behavioral.p1_Command.command.LightOnCommand;

public class CommandApp {

    public static void call() {
        LightReceiver lightReceiver = new LightReceiver();
        // Создаем команды
        Command lightOnCommand = new LightOnCommand(lightReceiver);
        Command lightOffCommand = new LightOffCommand(lightReceiver);

        // Менеджер команд
        CommandManagerInvoker commandManagerInvoker = new CommandManagerInvoker();
        commandManagerInvoker.addCommand(lightOnCommand);
        commandManagerInvoker.addCommand(lightOffCommand);

        // Выполнить все команды
        System.out.println("Executing commands:");
        commandManagerInvoker.executeAllCommand();

        // Отменить все команды
        System.out.println("\nCanceling commands:");
        commandManagerInvoker.cancelAllCommand();
    }
}
