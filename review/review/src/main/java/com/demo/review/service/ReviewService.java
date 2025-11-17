package com.demo.review.service;

import com.demo.review.entity.Review;

import java.util.List;

public interface ReviewService {
    List<Review> getAllReviews(Long companyId);
    boolean addReview(Long companyId, Review review);
    Review getReview(Long companyId);
    boolean updateReview( Long reviewId, Review review);
    boolean deleteReview(Long reviewId);
}
