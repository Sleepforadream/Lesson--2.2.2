package web.service;

import web.model.CarModel;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    public static List<CarModel> getCarsByCount(List<CarModel> allCars, String count) {
        if (count == null) return allCars;
        List<CarModel> viewedCars = new ArrayList<>();
        try {
            int countOfCars = Integer.parseInt(count);
            if (countOfCars >= 5) {
                return allCars;
            }
            for (int i = 0; i < countOfCars; i++) {
                viewedCars.add(allCars.get(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
            return allCars;
        }
        return viewedCars;
    }
}
