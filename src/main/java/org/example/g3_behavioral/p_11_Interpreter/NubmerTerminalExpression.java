package org.example.g3_behavioral.p_11_Interpreter;

import lombok.RequiredArgsConstructor;

/**
 * Терминальные выражения
 */
@RequiredArgsConstructor
public class NubmerTerminalExpression implements Expression {

    private final int number;

    @Override
    public int interpret() {
        return number;
    }
}

