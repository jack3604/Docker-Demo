package net.ddns.adisson.dockerdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class CarController {
    CarService carService;

    @PostMapping()
    public Car addCar(@RequestBody Car car) {
        return carService.addCar(car);
    }
}
