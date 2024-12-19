package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        CarService carService = new CarServiceImpl();
        List<Car> cars = new ArrayList<>();
        if (count <=5) {
            for (int i = 0; i < count; i++) {
                cars.add(carService.getCars().get(i));
            }
        } else {
            cars = carService.getCars();
        }
        model.addAttribute("cars", cars);
        return "/cars";
    }


}
