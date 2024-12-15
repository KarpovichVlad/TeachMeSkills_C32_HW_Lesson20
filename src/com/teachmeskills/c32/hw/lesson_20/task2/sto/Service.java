package com.teachmeskills.c32.hw.lesson_20.task2.sto;

import com.teachmeskills.c32.hw.lesson_20.task2.constant.Constants;
import java.util.LinkedList;
import java.util.Queue;

public class Service implements Constants {
    private final Queue<String> cars = new LinkedList<>();

    public synchronized void addCar(String car) throws InterruptedException {
        while (cars.size() >= MAX_CARS) {
            System.out.println("СТО переполнено. Ожидание места для машины: " + car);
            wait();
        }
        cars.add(car);
        System.out.println("Машина добавлена на обслуживание: " + car);
        notifyAll();
    }

    public synchronized String takeCar() throws InterruptedException {
        while (cars.isEmpty()) {
            System.out.println("Нет машин на обслуживании. Ожидание...");
            wait();
        }
        String car = cars.poll();
        System.out.println("Машина забрана после обслуживания: " + car);
        notifyAll();
        return car;
    }
}
