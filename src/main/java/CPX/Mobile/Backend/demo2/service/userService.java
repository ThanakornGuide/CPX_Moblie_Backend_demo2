package CPX.Mobile.Backend.demo2.service;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

import org.apache.kafka.common.errors.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import CPX.Mobile.Backend.demo2.model.userModel;
import CPX.Mobile.Backend.demo2.repository.userRepository;

@Service
public class userService {
    
    @Autowired
    private userRepository uRepository;

    public List<userModel> getAllUser(){

        return uRepository.findAll();
    }

    public userModel createUser(userModel user) throws IOException{

        if(user.equals(null)){
            throw new IOException("null");
        }

        if(Objects.isNull(user.getEmail())){
            throw new IOException("Email is not");
        }

        return uRepository.save(user);
    }

    public userModel getUserById(Long id) {
         
        return uRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not exist with id:" + id));
    }

    public userModel putUpdateUser(long id, userModel userDetails) {
        userModel user = uRepository.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("User not exist with id:" + id));

        user.setUsername(userDetails.getUsername());
        user.setLastName(userDetails.getLastName());

        user.setLastName(userDetails.getLastName());
        user.setLastName(userDetails.getLastName());

        user.setEmail(userDetails.getEmail());
        user.setEmail(userDetails.getEmail());

        uRepository.save(user);

        return user;
    }

    public userModel patchUpdateNameUser(long id, userModel userDetails) {
        userModel user = uRepository.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("User not exist with id:" + id));

        user.setLastName(userDetails.getLastName());
        user.setLastName(userDetails.getLastName());

        uRepository.save(user);

        return user;
    }
 

    public ResponseEntity<HttpStatus> deleteUser(long id){

        userModel user = uRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not exist with id:" + id));

        uRepository.delete(user);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    } 
}
