package org.example.g2_structural.p3_Adapter;

import lombok.RequiredArgsConstructor;

/**
 * Адаптер, который позволит европейскому устройству
 * подключаться к американской розетке.
 * Он будет реализовывать интерфейс американского разъема
 * и использовать европейское устройство.
 */

@RequiredArgsConstructor
public class SocketAdapter implements AmericanSocket {

    private final EuropeanSocket europeanSocket;

    @Override
    public void plugIn() {
        // Преобразование интерфейса: подключаем европейское устройство через американскую розетку
        europeanSocket.connect();
    }
}