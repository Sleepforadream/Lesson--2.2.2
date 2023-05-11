package web.service;

import web.model.CarModel;

import java.util.List;

public interface CarService {
    void addCar(CarModel car);

    void removeCarById(int id);

    CarModel getCarById(int id);

    List<CarModel> getAllCars();

    List<CarModel> getCarsByCount(int count);

}
