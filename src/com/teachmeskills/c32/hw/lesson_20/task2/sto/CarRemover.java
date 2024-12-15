package com.teachmeskills.c32.hw.lesson_20.task2.sto;

public class CarRemover implements Runnable {
    private final Service service;

    public CarRemover(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                service.takeCar();
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
