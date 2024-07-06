package dev.aksayaa.Moviesss;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import  org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
@CrossOrigin(origins="*")
public class moviecontroller {
    @Autowired
    private movieservice movieService;

    @GetMapping
    public ResponseEntity<List<movie>> getMovies() {
        return new ResponseEntity<List<movie>>(movieService.findAllMovies()  , HttpStatus.OK);
    }
    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<movie>> getSingleMovie(@PathVariable String imdbId) {
        return new ResponseEntity<Optional<movie>>(movieService.findMovieByImdbId(imdbId), HttpStatus.OK);

    }
}