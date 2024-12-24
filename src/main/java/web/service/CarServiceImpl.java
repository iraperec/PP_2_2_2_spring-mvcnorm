package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;
import web.config.WebConfig;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> cars;

    @Autowired
    public CarServiceImpl(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public List<Car> getCarsBySize (int size) {
        List<Car> carsList = new ArrayList<>();
        if (size <=5) {
            for (int i = 0; i < size; i++) {
                carsList.add(cars.get(i));
            }
        } else {
            carsList = cars;
        }
        return carsList;
    }

}
