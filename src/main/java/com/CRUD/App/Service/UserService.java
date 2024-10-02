package com.CRUD.App.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.CRUD.App.Model.User;
import  com.CRUD.App.Repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user){
        return userRepository.save(user);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id){
        return userRepository.findById(id);
    }

    public User updateUser(Long id, User userDetails){
        User user = userRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("User not Found by id: "+id));

        user.setName(userDetails.getName());
        user.setAge(userDetails.getAge());
        user.setGender(userDetails.getGender());
        user.setEmail(userDetails.getEmail());
        user.setDate(userDetails.getDate());
        return userRepository.save(user);
    }

    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }
}
