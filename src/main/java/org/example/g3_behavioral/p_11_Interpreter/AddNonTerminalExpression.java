package org.example.g3_behavioral.p_11_Interpreter;

import lombok.RequiredArgsConstructor;

/**
 * Нетерминальное выражение - добавление
 */
@RequiredArgsConstructor
public class AddNonTerminalExpression implements Expression {

    private final Expression leftExpression;
    private final Expression rightExpression;

    @Override
    public int interpret() {
        return leftExpression.interpret() + rightExpression.interpret();
    }
}
