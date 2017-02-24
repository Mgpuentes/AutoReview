package synergist.bootcamp.autoreview.model;

public class Review {
	private Integer carId;
	private Integer rating;
	private String review;
	private String reviewerName;
	private Integer likes;
	private Integer dislikes;
	private Integer id;
	
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCarId() {
		return carId;
	}

	public void setCarId(Integer carId) {
		this.carId = carId;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public String getReviewerName() {
		return reviewerName;
	}

	public void setReviewerName(String reviewerName) {
		this.reviewerName = reviewerName;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public Integer getDislikes() {
		return dislikes;
	}

	public void setDislikes(Integer dislikes) {
		this.dislikes = dislikes;
	}

	
	
	@Override
	public String toString() {
		return "Review [carId=" + carId + ", rating=" + rating + ", review=" + review + ", reviewerName=" + reviewerName
				+ ", likes=" + likes + ", dislikes=" + dislikes + ", getCarId()=" + getCarId() + ", getRating()="
				+ getRating() + ", getReview()=" + getReview() + ", getReviewerName()=" + getReviewerName()
				+ ", getLikes()=" + getLikes() + ", getDislikes()=" + getDislikes() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}

	