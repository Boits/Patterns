package org.example;

import org.example.g1_creational.p2_Factory_Method.FactoryMethodApp;
import org.example.g1_creational.p5_Singleton.SingletonApp;
import org.example.g2_structural.p4_Facade.FacadeApp;
import org.example.g2_structural.p5_Flyweight.FlyweightApp;
import org.example.g2_structural.p6_Proxy.ProxyApp;
import org.example.g2_structural.p7_Bridge.BridgeApp;
import org.example.g3_behavioral.p1_Command.CommandApp;
import org.example.g3_behavioral.p2_State.StateApp;
import org.example.g3_behavioral.p3_Template_Method.TemplateMethodApp;
import org.example.g3_behavioral.p4_Observer.ObserverApp;
import org.example.g3_behavioral.p5_Memento.MementoApp;
import org.example.g3_behavioral.p6_Mediator.MediatorApp;
import org.example.g3_behavioral.p7_Strategy.StrategyApp;
import org.example.g3_behavioral.p8_Iterator.IteratorApp;
import org.example.g3_behavioral.p9_Chain_Of_Responsibility.ChainOfResponsibilityApp;
import org.example.g3_behavioral.p_10_Visitor.VisitorApp;
import org.example.g3_behavioral.p_11_Interpreter.InterpreterApp;

public class PatternsApp {

    public static void main(String[] args) {
        //Creational Patterns (BeeF PAuSe (5))
//        creationalPatterns();

        //Structural Patterns (DeCAFF PuB (7))
//        structuralPatterns();

        //Behavioral Patterns (CuSTOM MuSIC VIew (11))
        behavioralPatterns();
    }

    private static void behavioralPatterns() {
        //Behavioral Patterns (CuSTOM MuSIC VIew (11))

        //1 Command
//        CommandApp.call();

        //2 State
//        StateApp.call();

        //3 Template method (общие шаги алгоритма, некоторые можно переопределить)
//        TemplateMethodApp.call();

        //4 Observer (Наблюдатель) (Уведомляет всех наблюдателей при каких-то событиях)
        ObserverApp.call();

        //5 Memento (Снимок состояния объекта)
//        MementoApp.call();

        //6 Mediator (Отправка сообщений всем через посредника)
//        MediatorApp.call();

        //7 Strategy
//        StrategyApp.call();

        //8 Iterator
//        IteratorApp.call();

        //9 Chain Of Responsibility (Цепочка объектов-получателей обрабатывает запрос)
//        ChainOfResponsibilityApp.call();

        //10 Visitor (Посетитель)
//        VisitorApp.call();

        //11 Interpreter
//        InterpreterApp.call();
    }

    private static void structuralPatterns() {
        //Structural Patterns (DeCAFF PuB (7))

        //1 Decorator (Обертка, добавление новых фич)
//        DecoratorApp.call();

        //2 Composite (Компоновщик, (Дерево))
//        CompositeApp.call();

        //3 Adapter (Переводчик одгого интерфейса в другой)
//        AdapterApp.call();

        //4 Facade (1 упрощенный интерфейс для сложной подсистемы)
//        FacadeApp.call();

        //5 Flyweight (Приспособленец (Оптимизация памяти))
//        FlyweightApp.call();

        //6 Proxy (объект-заместитель)
//        ProxyApp.call();

        //7 Bridge (Мост) (Абстракция и реализация)
        BridgeApp.call();
    }

    private static void creationalPatterns() {
        //Creational Patterns (BeeF PAuSe (5))

        //1 Builder
//        BuilderApp.call();

        //2 Factory Method
        FactoryMethodApp.call();

        //3 Prototype (Clone object)
//        PrototypeApp.call();

        //4 Abstract Factory (Фабрика фабрик)
//        AbstractFactoryApp.call();

        // 5 Singleton
//        SingletonApp.call();
    }

}