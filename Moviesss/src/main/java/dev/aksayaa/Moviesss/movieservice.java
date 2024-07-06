package dev.aksayaa.Moviesss;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;
import java.util.StringJoiner;

@Service
public class movieservice {
    @Autowired
    private movierepositry movierepositry;

    public List<movie> findAllMovies() {
        return movierepositry.findAll();

    }

    public Optional<movie> findMovieByImdbId(String imdbId) {
        return movierepositry.findMovieByImdbId(imdbId);


    }

}
