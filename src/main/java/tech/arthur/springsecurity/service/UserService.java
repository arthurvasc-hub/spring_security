package tech.arthur.springsecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.arthur.springsecurity.model.User;
import tech.arthur.springsecurity.repository.UserRepository;

@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {}


    public User saveUser(User user) {
        return userRepository.save(user);
    }

}
