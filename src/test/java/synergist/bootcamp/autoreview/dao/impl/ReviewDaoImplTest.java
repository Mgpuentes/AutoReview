package synergist.bootcamp.autoreview.dao.impl;


import com.github.fakemongo.Fongo;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import org.jongo.Jongo;
import org.jongo.JongoNative;
import org.junit.*;
import synergist.bootcamp.autoreview.dao.ReviewDao;
import synergist.bootcamp.autoreview.model.Review;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ReviewDaoImplTest {
    private static final String DB_NAME = "testautoreview";
    private static final String COLLECTION_NAME = "reviews";
    private static MongoClient mongoClient;
    private static MongoCollection collection;
    private static JongoNative jongoNative;

    private static ReviewDao reviewDao;

    @BeforeClass
    //create our fake mongo db before running all tests
    public static void setUpBeforeClass() {
        //this is creating an in memory mongo database that is fast and popular to use for testing.
        mongoClient  = new Fongo("testReviews").getMongo();
        jongoNative = Jongo.useNative(mongoClient.getDatabase(DB_NAME));
        collection = jongoNative.getCollection(COLLECTION_NAME, Review.class);
        reviewDao = new ReviewDaoImpl(collection);
    }

    @AfterClass
    //close our connection to the fake mongo db after running all tests
    public static void tearDownAfterClass() throws Exception {
        mongoClient.close();
    }

    @Before
    //populate our collection before each test
    public void setUp() throws Exception {
        List reviews = new ArrayList();
        for(int i = 0; i<50; i++)
            reviews.add(build(i));

        collection.insertMany(reviews);
    }

    @After
    //drop our collection after each test
    public void tearDown() throws Exception {
        collection.drop();
    }

    private static Review build(Integer seed) {
        Review review = new Review();
        review.setId(seed.toString());
        review.setCarId(seed);
        review.setRating(seed+50);

        return review;
    }

    @Test
    public void getReviewByIdTest() {
    	
    	
        Integer reviewId = 1;
        Review review = reviewDao.getReviewById(reviewId.toString());
        assertEquals(reviewId.toString(), review.getId());
        reviewId = 51;
        review = reviewDao.getReviewById(reviewId.toString());
        assertNull(review);
        
    	
    	/*
    	Review review = new Review();
    	review.setId("555555");
    	reviewDao.addReview(review);
    	assertEquals(review.getId(), reviewDao.getReviewById("555555"));
    	*/
    }
    
    
    //Test Adding a Review
    @Test
    public void testAddingAReview(){
    	Integer id = 100000000;
    	Review review = build(id);
    	reviewDao.addReview(review);

    	assertEquals(review.getId(), reviewDao.getReviewById(id.toString()).getId());
    }
    
    
    //Test Deleting a Review
}