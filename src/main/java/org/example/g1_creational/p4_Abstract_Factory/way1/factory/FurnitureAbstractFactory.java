package org.example.g1_creational.p4_Abstract_Factory.way1.factory;

import org.example.g1_creational.p4_Abstract_Factory.way1.product.Chair;
import org.example.g1_creational.p4_Abstract_Factory.way1.product.Table;

/**
 * Интерфейс абстрактной фабрики для создания мебели
 */
public interface FurnitureAbstractFactory {

    /**
     * Фабричные методы
     */
    Chair createChair();

    Table createTable();
}
