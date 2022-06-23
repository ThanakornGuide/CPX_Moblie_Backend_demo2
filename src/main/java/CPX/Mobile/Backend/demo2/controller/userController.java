package CPX.Mobile.Backend.demo2.controller;

import java.net.URI;
import java.util.List;

import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import CPX.Mobile.Backend.demo2.exception.ResourceNotFoundException;
import CPX.Mobile.Backend.demo2.model.User;
import CPX.Mobile.Backend.demo2.repository.userRepository;

@RestController
@RequestMapping(path = "/api/v1/user")
public class userController {


    @Autowired
    private userRepository uRepository;

    @GetMapping
    public List<User> getAllUser(){
        return uRepository.findAll();
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return uRepository.save(user);
    }

    @GetMapping("{id}")
    public ResponseEntity<User> getUserById(@PathVariable long id){
        User user = uRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not exist with id:" + id));

        return ResponseEntity.ok(user);
    }

    @PutMapping("{id}")
    public ResponseEntity<User> updateUserById(@PathVariable long id,@RequestBody User userDetails) {
        User updateUser = uRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not exist with id:" + id));

        updateUser.setUsername(userDetails.getUsername());
        updateUser.setLastName(userDetails.getLastName());

        uRepository.save(updateUser);

        return ResponseEntity.ok(updateUser);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable long id){

        User user = uRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not exist with id:" + id));

        uRepository.delete(user);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }

}
