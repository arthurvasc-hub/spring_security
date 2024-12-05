package tech.arthur.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.arthur.springsecurity.model.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
}
