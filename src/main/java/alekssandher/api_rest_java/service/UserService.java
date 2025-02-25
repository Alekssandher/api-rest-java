package alekssandher.api_rest_java.service;

import alekssandher.api_rest_java.model.User;

public interface UserService{
    User findById(Long id);
    User create(User user);
}   
