package dev.aksayaa.Moviesss;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.view.RedirectView;
@Repository
public interface reviewrepository extends MongoRepository<reviews, ObjectId> {
}
