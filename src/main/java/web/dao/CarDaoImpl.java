package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.model.CarModel;

import java.util.List;

@Component
public class CarDaoImpl implements CarDao {
    private final List<CarModel> cars;

    @Autowired
    CarDaoImpl(List<CarModel> cars) {
        this.cars = cars;
        cars.add(new CarModel("BMW", "red", 2009));
        cars.add(new CarModel("Mercedes", "blue", 2005));
        cars.add(new CarModel("Porsche", "black", 2019));
        cars.add(new CarModel("Lada", "white", 1994));
        cars.add(new CarModel("Honda", "black", 2015));
    }

    @Override
    public void addCar(CarModel car) {
        cars.add(car);
    }

    @Override
    public void removeCarById(int id) {
        cars.remove(id);
    }

    @Override
    public CarModel getCarById(int id) {
        return cars.get(id);
    }

    @Override
    public List<CarModel> getAllCars() {
        return cars;
    }

    @Override
    public List<CarModel> getCarsByCount(int count) {
        return cars.subList(0, Math.min(count,5));
    }
}
