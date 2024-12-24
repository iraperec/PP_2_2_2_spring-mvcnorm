package web.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import web.model.Car;

@Configuration
public class CarConfig {

    @Bean
    public Car toyota() {
        return new Car("Toyota", 2020, "Black");
    }

    @Bean
    public Car honda() {
        return new Car("Honda", 2019, "White");
    }

    @Bean
    public Car ford() {
        return new Car("Ford", 2021, "Red");
    }

    @Bean
    public Car chevrolet() {
        return new Car("Chevrolet", 2018, "Blue");
    }

    @Bean
    public Car nissan() {
        return new Car("Nissan", 2022, "Gray");
    }

}
