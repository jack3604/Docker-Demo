package net.ddns.adisson.dockerdemo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarController {
    private final CarService carService;
    private final CarRepository carRepository;

    public CarController(CarService carService, CarRepository carRepository) {
        this.carService = carService;
        this.carRepository = carRepository;
    }

    @PostMapping("/addCar")
    public Car addCar(@RequestParam(value = "carMake", defaultValue = "Toyota") String make,
                      @RequestParam(value = "carModel", defaultValue = "Camry") String model,
                      @RequestParam(value = "carYear", defaultValue = "2024") String year) {
        String id = String.valueOf(carRepository.count());
        Car car = new Car(id, make, model, Integer.parseInt(year));
        return carService.addCar(car);
    }

    @GetMapping("/listCars")
    public List<Car> listCars() {
        return carService.listCars();
    }
}
