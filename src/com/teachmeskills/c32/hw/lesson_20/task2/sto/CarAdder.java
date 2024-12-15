package com.teachmeskills.c32.hw.lesson_20.task2.sto;

public class CarAdder implements Runnable {
    private final Service service;

    public CarAdder(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                String car ="Car-"+ i;
                service.addCar(car);
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

}
