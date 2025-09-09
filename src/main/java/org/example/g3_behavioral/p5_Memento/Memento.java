package org.example.g3_behavioral.p5_Memento;

import lombok.RequiredArgsConstructor;

/**
 * Memento (Снимок) — объект, который хранит состояние Originator (Создатель),
 * но не предоставляет методов для изменения этого состояния.
 */
@RequiredArgsConstructor
public class Memento {

    private final String state;

    public String getState() {
        return state;
    }
}
