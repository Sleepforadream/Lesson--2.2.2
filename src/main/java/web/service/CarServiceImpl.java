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
    CarServiceImpl (CarDao cardao) {
        this.carDao = cardao;
        addMyCars();
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
    public List<CarModel> getCarsByCount(String count) {
        if (count == null) return carDao.getAllCars();
        try {
            return carDao.getCarsByCount(Integer.parseInt(count));
        } catch (NumberFormatException exception) {
            return null;
        }
    }

    public void addMyCars() {
        carDao.addCar(new CarModel("BMW","red",2009));
        carDao.addCar(new CarModel("Mercedes","blue",2005));
        carDao.addCar(new CarModel("Porsche","black",2019));
    }
}
