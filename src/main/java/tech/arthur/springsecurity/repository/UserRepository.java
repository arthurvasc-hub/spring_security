package tech.arthur.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.arthur.springsecurity.model.User;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
    ;
}
