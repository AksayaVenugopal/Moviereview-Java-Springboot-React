package dev.aksayaa.Moviesss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class reviewservice {
    @Autowired
    private reviewrepository reviewRepository;
    @Autowired
    private MongoTemplate mongoTemplate;
    public reviews createReview( String reviewBody,String imdbId) {
        reviews review = reviewRepository.insert(new reviews(reviewBody, LocalDateTime.now(),LocalDateTime.now()));


        mongoTemplate.update(movie.class)
                .matching(Criteria.where("imdbId").is(imdbId))
                .apply(new Update().push("reviewIds").value(review.getId()))
                .first();
        return review;

    }
}
