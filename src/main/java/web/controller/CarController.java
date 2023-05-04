package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.CarModel;
import web.service.CarService;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String viewSalon(ModelMap model, HttpServletRequest request) {
        List<CarModel> salon = new ArrayList<>();

        salon.add(new CarModel("BMW","black",2022));
        salon.add(new CarModel("Mercedes","white",2021));
        salon.add(new CarModel("Mazda","blue",2018));
        salon.add(new CarModel("Lada", "Brown", 1999));
        salon.add(new CarModel("Porsche","Red",2005));

        model.addAttribute("salon",CarService.getCarsByCount(salon, request.getParameter("count")));

        return "salon/cars";
    }
}
