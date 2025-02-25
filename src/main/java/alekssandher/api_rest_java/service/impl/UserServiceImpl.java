package alekssandher.api_rest_java.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import alekssandher.api_rest_java.model.User;
import alekssandher.api_rest_java.repository.UserRepository;
import alekssandher.api_rest_java.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }
    @Override
    public User findById(Long id) {
       return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User user) {
       if(user.getId() != null && userRepository.existsById(user.getId())){
        throw new IllegalArgumentException("This account number already exists");
       }

       return userRepository.save(user);
    }
    
}
