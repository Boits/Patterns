package org.example.g3_behavioral.p_11_Interpreter;

public class InterpreterApp {

    public static void call() {
        // (5 + 2) - (3 + 1) = 3
        Expression five = new NubmerTerminalExpression(5);
        Expression two = new NubmerTerminalExpression(2);
        Expression three = new NubmerTerminalExpression(3);
        Expression one = new NubmerTerminalExpression(1);

        // Создание выражений
        Expression add = new AddNonTerminalExpression(five, two);
        Expression add2 = new AddNonTerminalExpression(three, one);
        Expression subtract = new SubtractNonTerminalExpression(add, add2);

        // Интерпретация результата
        int result = subtract.interpret();
        System.out.println("Result: " + result); // Вывод: Result: 3
    }
}
