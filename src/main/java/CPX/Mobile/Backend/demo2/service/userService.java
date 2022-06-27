package CPX.Mobile.Backend.demo2.service;

import java.lang.StackWalker.Option;
import java.util.List;

import org.apache.kafka.common.errors.ResourceNotFoundException;
import org.hibernate.hql.internal.ast.exec.BasicExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import CPX.Mobile.Backend.demo2.dto.userDAO;
import CPX.Mobile.Backend.demo2.exception.UserNotFoundException;
import CPX.Mobile.Backend.demo2.model.userModel;
import CPX.Mobile.Backend.demo2.repository.userRepository;

@Service
public class userService {
    
    @Autowired
    private userRepository uRepository;

    public List<userModel> getAllUser(){

        return uRepository.findAll();
    }

    public userModel createUser(userModel user){

        return uRepository.save(user);
    }

    public userModel getUserById(Long id){
        
        //userModel user = new userModel();

        return uRepository.findById(id)
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("User with id %d not found", id)));
        //    try {

        //     return ResponseEntity.status(HttpStatus.OK).body(user);

        //    } catch (RuntimeException e) {
        //     //TODO: handle exception
        //      throw new RuntimeException("User not exist with id:" + id);
        //    }

          

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
