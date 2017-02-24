package synergist.bootcamp.autoreview.dao.impl;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import org.bson.Document;
import synergist.bootcamp.autoreview.dao.ReviewDao;
import synergist.bootcamp.autoreview.model.Review;

import java.util.ArrayList;
import java.util.List;

public class ReviewDaoImpl implements ReviewDao {
    private MongoCollection<Review> reviewCollection;

    public ReviewDaoImpl(MongoCollection<Review> reviewCollection){
        this.reviewCollection = reviewCollection;
    }

    @Override
    public Review getReviewById(Integer id) {
        return reviewCollection.find(new Document("id", id)).first();
    }

    @Override
    public List getReviewByCarId(Integer carId, Integer numberPerPage, Integer pageNumber) {
        MongoCursor mongoCursor = reviewCollection.find(new Document("carId", carId)).sort(new Document("id", -1))
                .skip(numberPerPage*pageNumber).limit(pageNumber).iterator();

        List reviewList = new ArrayList();
        while(mongoCursor.hasNext()) {
            reviewList.add(mongoCursor.next());
        }

        return reviewList;
    }

    @Override
    public void addReview(Review review) {
        reviewCollection.insertOne(review);
    }

    @Override
    public void deleteReview(Review review) {
        reviewCollection.deleteMany(new Document("id", review.getCarId()));
    }

	

	
}