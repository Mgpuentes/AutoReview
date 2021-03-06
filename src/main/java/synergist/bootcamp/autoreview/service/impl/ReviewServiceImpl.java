package synergist.bootcamp.autoreview.service.impl;

import synergist.bootcamp.autoreview.dao.ReviewDao;
import synergist.bootcamp.autoreview.model.Review;
import synergist.bootcamp.autoreview.service.ReviewService;

import java.util.List;

public class ReviewServiceImpl implements ReviewService {
	private ReviewDao reviewDao;
    public ReviewServiceImpl(ReviewDao reviewDao) {
        this.reviewDao = reviewDao;
    }
    @Override
    public Review getReviewById(String id) {
        return reviewDao.getReviewById(id);
    }
    @Override
    public List<Review> getReviewsByCarId(Integer carId, Integer numberPerPage, Integer pageNumber) {
        return reviewDao.getReviewsByCarId(carId, numberPerPage, pageNumber);
    }
    @Override
    public void addReview(Review review) {
        reviewDao.addReview(review);
    }
    @Override
    public void deleteReview(Review review) {
        reviewDao.deleteReview(review);
    }
}