package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
        List<Car> getCarsBySize (int size);
        List<Car> getCars();
}
