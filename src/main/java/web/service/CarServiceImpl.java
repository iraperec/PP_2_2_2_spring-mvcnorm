package web.service;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import web.config.WebConfig;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    private List<Car> cars = new ArrayList<>();

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(WebConfig.class);
    Car car = context.getBean("car", Car.class);
    Car car1 = context.getBean("car", Car.class);
    Car car2 = context.getBean("car", Car.class);
    Car car3 = context.getBean("car", Car.class);

    @Override
    public List<Car> getCars() {
        car.setAll("Lada", 2021, "green");
        cars.add(car);
        car1.setAll("Mazda", 2020, "red");
        cars.add(car1);
        car2.setAll("Toyota", 2022, "white");
        cars.add(car2);
        car3.setAll("BMW", 2023, "yellow");
        cars.add(car3);
        return cars;
    }

    @Override
    public List<Car> getCarsBySize (int size) {
        List<Car> carsList = new ArrayList<>();
        if (size <=5) {
            for (int i = 0; i < size; i++) {
                cars.add(getCars().get(i));
            }
        } else {
            cars = getCars();
        }
        return carsList;
    }

}
