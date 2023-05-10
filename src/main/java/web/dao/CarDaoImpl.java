package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.model.CarModel;

import java.util.List;
@Component
public class CarDaoImpl implements CarDao {
    private List<CarModel> cars;

    @Autowired
    CarDaoImpl (List<CarModel> cars) {
        this.cars = cars;
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
        return cars.subList(0,count);
    }
}
