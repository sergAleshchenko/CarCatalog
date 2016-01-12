package service;

import model.Car;

import java.util.Collection;

public interface CarService {

    Boolean add(Car car);

    void update(Car car);

    Collection<Car> getCars(String search);

    void delete(Car car);

}