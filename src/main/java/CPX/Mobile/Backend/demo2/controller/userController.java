package CPX.Mobile.Backend.demo2.controller;

import java.net.URI;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import CPX.Mobile.Backend.demo2.exception.UserNotFoundException;
import CPX.Mobile.Backend.demo2.model.userModel;
import CPX.Mobile.Backend.demo2.service.userService;

@RestController
@RequestMapping(path = "/api")
public class userController {


    @Autowired
    private userService uService;

    @GetMapping("/v1/users")
    public List<userModel> getAllUser(){

        List<userModel> listUser = uService.getAllUser();
        return listUser;
    }

    @PostMapping("/v1/user")
    public ResponseEntity<userModel> createUser(@Valid @RequestBody userModel user) {
        
        userModel saveUser = uService.createUser(user);
        return new ResponseEntity<userModel>(saveUser, HttpStatus.CREATED);
    }

    @GetMapping("/v1/user/{id}")
    public userModel getUser(@PathVariable long id) {
           return uService.getUserById(id);
    }

    @PutMapping("/v1/user/{id}")
    public ResponseEntity<userModel> putUpdateUserById(@PathVariable long id,@RequestBody userModel userDetails) {

        userModel updateUser = uService.putUpdateUser(id, userDetails);
        return ResponseEntity.ok(updateUser);
    }

    @PatchMapping("/v1/user/{id}")
    public ResponseEntity<userModel> patchUpdateUserById(@PathVariable long id,@RequestBody userModel userDetails) {

        userModel updateUser = uService.patchUpdateNameUser(id, userDetails);
        return ResponseEntity.ok(updateUser);
    } 

    @DeleteMapping("/v1/user/{id}")
    public String deleteUser(@PathVariable long id){

        String s = uService.deleteUser(id).toString();

        return s;

    }

}
