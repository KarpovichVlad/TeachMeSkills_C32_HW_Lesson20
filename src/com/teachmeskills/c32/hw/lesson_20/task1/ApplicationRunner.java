package com.teachmeskills.c32.hw.lesson_20.task1;

import com.teachmeskills.c32.hw.lesson_20.task1.morning.ReadNews;
import com.teachmeskills.c32.hw.lesson_20.task1.morning.HaveBreakfast;
import com.teachmeskills.c32.hw.lesson_20.task1.morning.DrinkCoffee;
import com.teachmeskills.c32.hw.lesson_20.task1.constant.Constants;

/**
 * Задача 1
 * 1. Cоздать программу, иммитирующую утро: чтение нововостей, завтрак, кофе.
 * Каждому потоку задать имя и приоритет из конфиг файла.
 * Пусть будет 3 потока.
 * Создать и запустить 3 потока.
 * Сделать два варианта: используя интерфейс Runnable и/или используя класс Thread.
 */

public class ApplicationRunner {
    public static void main(String[] args) {

        Runnable readNews = new ReadNews();
        Runnable haveBreakfast = new HaveBreakfast();
        Runnable drinkCoffee = new DrinkCoffee();

        Thread thread1 = new Thread(readNews, "Поток новостей");
        Thread thread2 = new Thread(haveBreakfast, "Поток завтрака");
        Thread thread3 = new Thread(drinkCoffee, "Поток кофе");

        thread1.setPriority(Constants.READ_NEWS_PRIORITY);
        thread2.setPriority(Constants.HAVE_BREAKFAST_PRIORITY);
        thread3.setPriority(Constants.DRINK_COFFEE_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
