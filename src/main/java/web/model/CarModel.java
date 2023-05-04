package web.model;

import java.util.Objects;

public class CarModel {
    private String model;
    private String color;
    private int yearOfCreate;
    public CarModel(String model, String color, int yearOfCreate) {
        this.model = model;
        this.color = color;
        this.yearOfCreate = yearOfCreate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarModel car = (CarModel) o;
        return yearOfCreate == car.yearOfCreate && Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color, yearOfCreate);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearOfCreate() {
        return yearOfCreate;
    }

    public void setYearOfCreate(int yearOfCreate) {
        this.yearOfCreate = yearOfCreate;
    }
}
