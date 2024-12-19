package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    List<Car> cars = new ArrayList<>();
    public List<Car> getCars() {
        cars.add(new Car("Toyota", 1980, "red"));
        cars.add(new Car("Kia", 2009, "white"));
        cars.add(new Car("BMW", 2020, "blue"));
        cars.add(new Car("Mazda", 1999, "black"));
        cars.add(new Car("LADA", 2000, "green"));
        return cars;
    }

    @Override
    public int countCar() {
        return cars.size();
    }
}
