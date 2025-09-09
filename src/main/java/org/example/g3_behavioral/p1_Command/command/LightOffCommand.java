package org.example.g3_behavioral.p1_Command.command;

import lombok.RequiredArgsConstructor;
import org.example.g3_behavioral.p1_Command.LightReceiver;

@RequiredArgsConstructor
public class LightOffCommand implements Command {

    private final LightReceiver lightReceiver;

    @Override
    public void execute() {
        lightReceiver.turnOff();
    }

    @Override
    public void cancel() {
        System.out.println("LightOffCommand is canceled");
    }
}
