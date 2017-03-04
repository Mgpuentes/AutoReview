package synergist.bootcamp.autoreview.dao;

import java.util.List;

import synergist.bootcamp.autoreview.model.Review;

public interface ReviewDao {
	
Review getReviewById(String id);
	
	List<Review> getReviewsByCarId(Integer carId, Integer numberPerPage, Integer pageNumber);
	
	void addReview(Review review);
	
	void deleteReview(Review reveiw);
	

}
