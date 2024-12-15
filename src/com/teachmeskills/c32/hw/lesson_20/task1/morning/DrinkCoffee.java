package com.teachmeskills.c32.hw.lesson_20.task1.morning;

public class DrinkCoffee implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": Пить кофе");
    }
}
