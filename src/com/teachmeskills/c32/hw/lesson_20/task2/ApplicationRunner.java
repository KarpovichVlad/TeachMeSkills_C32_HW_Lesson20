package com.teachmeskills.c32.hw.lesson_20.task2;

import com.teachmeskills.c32.hw.lesson_20.task2.sto.CarAdder;
import com.teachmeskills.c32.hw.lesson_20.task2.sto.CarRemover;
import com.teachmeskills.c32.hw.lesson_20.task2.sto.Service;

/**
 * Задача 2
 * 2. Есть СТО. На сто может быть в обслуживании максимум определенное количество машин.
 * Создать класс, который будет запускаться в отдельном потоке и будет добавлять машины на обсуживание в СТО.
 * Создать класс, который будет запускаться в отдельном потоке и будет забирать исправленные машины из СТО.
 * Пусть максимальное количество доступных для обсуживания машин задается в интерфейсе для хранения констант.
 * Использовать synchronized, wait, notify.
 */

public class ApplicationRunner {
    public static void main(String[] args) {
        Service service = new Service();

        Thread adderThread = new Thread(new CarAdder(service));
        Thread removerThread = new Thread(new CarRemover(service));

        adderThread.start();
        removerThread.start();

    }
}
