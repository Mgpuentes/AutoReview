package synergist.bootcamp.autoreview.dao;

import java.util.List;

import synergist.bootcamp.autoreview.model.Car;

public interface CarDao {
	Car getCarById(Integer id);
	
	void addCar(Car car);
	
	void deleteCarById(Integer id);
	
	void updateCar(Car car);
	
	void getCarByMongoId(Integer id);
	
	List<Car> getCars();
	
	List<String> getDistinct(String fieldName);
	
	
}
