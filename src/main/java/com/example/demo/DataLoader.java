package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    CarRepository repository;

    @Override
    public void run(String... strings) throws Exception{
        Car car;
        car = new Car("2019", "Tesla", "Roadster1");
        repository.save(car);

        car = new Car("2018", "Tesla", "Roadster2");
        repository.save(car);

        car = new Car("2017", "Tesla", "Roadster3");
        repository.save(car);
    }
}
