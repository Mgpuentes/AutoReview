package synergist.bootcamp.autoreview.model;

import org.jongo.Jongo;
import org.jongo.JongoNative;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;

import synergist.bootcamp.autoreview.dao.ReviewDao;
import synergist.bootcamp.autoreview.dao.impl.ReviewDaoImpl;
import synergist.bootcamp.autoreview.service.ReviewService;
import synergist.bootcamp.autoreview.service.impl.ReviewServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
	private static String DB_NAME = "shopping1";
	private static String COLLECTION_NAME = "carInformation";
	private static final String REVIEW_COLLECTION_NAME = "reviewInfo";
	
    public static void main( String[] args )
    {
    	MongoClient client = new MongoClient();
    	JongoNative jongoNative = Jongo.useNative(client.getDatabase(DB_NAME));
    	//MongoCollection<Car> collection = jongoNative.getCollection(COLLECTION_NAME, Car.class);
    	//CarDao dao = new CarDaoImpl(collection);
    	
    	MongoCollection<Review> collection = jongoNative.getCollection(REVIEW_COLLECTION_NAME, Review.class);
    	ReviewDao dao = new ReviewDaoImpl(collection);
    	ReviewService reviewService = new ReviewServiceImpl(dao);
    	
    	Review review = new Review();
    	review.setRating(5656);
    	review.setId(123);
    	reviewService.addReview(review);
    	
    	/*
    	Car car1 = new Car();
    	car1.setCylinders("4");
    	car1.setTransmission("automatic");
    	car1.setYear("1700");
    	car1.setId(500000);
    	dao.addCar(car1);
    	car1.setTransmission("manual");
    	dao.updateCar(car1);
    	System.out.println(dao.getCars());
    	//dao.deleteCarById(500000);
    	//System.out.println(dao.getCarByMongoId("58928cbcd47d2d62fec9e0fc"));
    	System.out.println(dao.getCarById(500000));\
    	*/
    	Review review1 =reviewService.getReviewById(123);
    	System.out.println(review1);
    	
    }
}
