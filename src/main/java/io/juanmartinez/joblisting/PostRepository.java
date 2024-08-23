package io.juanmartinez.joblisting;

import io.juanmartinez.joblisting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post , String> {
}
