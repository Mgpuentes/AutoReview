package synergist.bootcamp.autoreview.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;

import synergist.bootcamp.autoreview.dao.CarDao;
import synergist.bootcamp.autoreview.model.Car;

public class CarDaoImpl implements CarDao {
	private MongoCollection<Car> collection;
	
	public CarDaoImpl (MongoCollection<Car> cars){
		collection = cars;
	}

	public Car getCarById(Integer id) {
		// TODO Auto-generated method stub
		return collection.find(new Document("id", id)).first();
		
	}

	public void addCar(Car car) {
		// TODO Auto-generated method stub
		collection.insertOne(car);

	}

	public void deleteCarById(Integer id) {
		// TODO Auto-generated method stub
		collection.deleteMany(new Document("id", id));

	}

	public void updateCar(Car car) {
		// TODO Auto-generated method stub
		collection.replaceOne(new Document("id", car.getId()), car);

	}

	public List<Car> getCars() {
		// TODO Auto-generated method stub
		MongoCursor<Car> cars = collection.find(Car.class).iterator();
		List<Car> list = new ArrayList<>();
		
		while(cars.hasNext()){
			list.add(cars.next());
			
		}
		return list;
	}

	public List<String> getDistinct(String fieldName) {
		// TODO Auto-generated method stub
		MongoCursor<String> cursor = collection.distinct(fieldName, String.class).iterator();
		List<String> list = new ArrayList();
		while(cursor.hasNext()){
			list.add(cursor.next());
			
		}
		return list;
	}

	public void getCarByMongoId(Integer id) {
		// TODO Auto-generated method stub
		
		
	}

	
	
	/*
	public void getCarByMongoId(String id){
		return collection.find(new Document("_id", new ObjectId(id))).first();
		
	}
	*/
	
	

}
