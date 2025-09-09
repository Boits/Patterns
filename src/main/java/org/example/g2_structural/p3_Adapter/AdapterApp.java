package org.example.g2_structural.p3_Adapter;

public class AdapterApp {

    public static void call() {
        // Европейское устройство
        EuropeanSocket europeanSocket = new EuropeanSocketImpl();

        // Адаптер для подключения европейского устройства к американской розетке
        AmericanSocket adapter = new SocketAdapter(europeanSocket);

        // Подключаем через адаптер
        adapter.plugIn();
    }
}
