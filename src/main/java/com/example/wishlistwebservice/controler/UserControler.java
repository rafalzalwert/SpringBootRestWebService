package com.example.wishlistwebservice.controler;

import com.example.wishlistwebservice.exception.ResourceNotFoundException;
import com.example.wishlistwebservice.model.User;
import com.example.wishlistwebservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserControler {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/jpa/users")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @PostMapping("/jpa/createuser")
    public User createUser(@Valid @RequestBody User user){
        return userRepository.save(user);
    }

    @GetMapping("/jpa/user/{id}")
    public  User getUserById(@PathVariable(value = "id") Long user_id){
        return userRepository.findById(user_id)
                .orElseThrow(() -> new ResourceNotFoundException("User","id",user_id));
    }


}
