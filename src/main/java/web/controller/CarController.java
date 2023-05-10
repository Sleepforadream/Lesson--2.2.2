package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import web.model.CarModel;
import web.service.CarService;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CarController {

    CarService carService;

    @Autowired
    CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String viewSalon(ModelMap model, HttpServletRequest request) {
        model.addAttribute("cars", carService.getCarsByCount(request.getParameter("count")));
        return "salon/cars";
    }
}
