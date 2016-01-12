package model.dao;

import model.Car;

import java.util.Collection;
import java.util.List;

public interface CarDao {

    void add(Car car);

    void update(Car car);

    void delete(Car car);

    List getCars(String search);

    public List findByCar(String name, Long price);

}
