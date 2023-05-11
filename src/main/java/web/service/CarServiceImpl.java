package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.CarModel;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    CarDao carDao;

    @Autowired
    CarServiceImpl(CarDao cardao) {
        this.carDao = cardao;
    }

    @Override
    public void addCar(CarModel car) {
        carDao.addCar(car);
    }

    @Override
    public void removeCarById(int id) {
        carDao.removeCarById(id);
    }

    @Override
    public CarModel getCarById(int id) {
        return carDao.getCarById(id);
    }

    @Override
    public List<CarModel> getAllCars() {
        return carDao.getAllCars();
    }

    @Override
    public List<CarModel> getCarsByCount(int count) {
        return carDao.getCarsByCount(count);
    }
}
