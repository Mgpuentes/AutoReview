package synergist.bootcamp.autoreview.service;

import java.util.List;

import synergist.bootcamp.autoreview.model.Car;
import synergist.bootcamp.autoreview.model.Review;

public interface ReviewService {
	
	Review getReviewById(Integer id);
	
	List<Review> getReviewByCarId(Integer carId, Integer numberPerPage, Integer pageNumber);
	
	void addReview(Review review);
	
	void deleteReview(Review review);
	
	

}
