package tech.arthur.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.arthur.springsecurity.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
