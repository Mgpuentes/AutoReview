package synergist.bootcamp.autoreview.service.impl;

import java.util.List;

import synergist.bootcamp.autoreview.dao.CarDao;
import synergist.bootcamp.autoreview.model.Car;
import synergist.bootcamp.autoreview.service.CarService;

public class CarServiceImpl implements CarService{
	CarDao carDao;
	
	

	@Override
	public Car getCarById(Integer id) {
		// TODO Auto-generated method stub
		return carDao.getCarById(id);
		
	}

	@Override
	public void addCar(Car car) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCarById(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCar(Car car) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Car> getCars() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getDistinct(String fieldName) {
		// TODO Auto-generated method stub
		return null;
	}

}
