package synergist.bootcamp.autoreview.service;

import java.util.List;

import synergist.bootcamp.autoreview.model.Car;

public interface CarService {
	
	Car getCarById(Integer id);
	
	void addCar(Car car);
	
	void deleteCarById(String id);
	
	void updateCar(Car car);
	
	List<Car> getCars();
	
	List<String> getDistinct(String fieldName);

}
