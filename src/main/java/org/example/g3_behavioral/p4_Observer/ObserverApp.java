package org.example.g3_behavioral.p4_Observer;

import org.example.g3_behavioral.p4_Observer.observer.MobileApp;
import org.example.g3_behavioral.p4_Observer.observer.Observer;
import org.example.g3_behavioral.p4_Observer.observer.WebApp;

public class ObserverApp {

    /**
     * В Spring:
     * <p>
     * ApplicationEvent: Базовый класс для всех событий в Spring.
     * Вы можете создать свои собственные события, расширяя этот класс.
     * <p>
     * ApplicationListener: Интерфейс, который вы реализуете, чтобы слушать события.
     * Когда событие происходит, метод onApplicationEvent() будет вызван.
     * <p>
     * ApplicationEventPublisher: Интерфейс, который вы используете для публикации событий.
     * Когда вы хотите оповестить слушателей о событии,
     * вы используете реализацию этого интерфейса, чтобы отправить событие.
     */

    public static void call() {
        Store store = new Store();

        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();

        store.registerObserver(mobileApp);
        store.registerObserver(webApp);

        store.newPromotion("50% off on all items!");

        //Mobile App received promotion: 50% off on all items!
        //Web App received promotion: 50% off on all items!

        store.removeObserver(mobileApp);
        store.removeObserver(webApp);
    }
}
