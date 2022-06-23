package CPX.Mobile.Backend.demo2.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import CPX.Mobile.Backend.demo2.model.userModel;
import CPX.Mobile.Backend.demo2.model.usersModel;
import CPX.Mobile.Backend.demo2.repository.userDAO;

@RestController
@RequestMapping(path = "/api")
public class userController {

    @Autowired
    private userDAO this_userDAO;

    @GetMapping(path = "/v1/getAllUserList" , produces = "application/json")
    public usersModel getUsers() {
        return this_userDAO.getAllUsers();
    }

    @PostMapping(path= "/v1/postAddUser", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addUser(@RequestBody userModel user) 
    {
        Integer id = this_userDAO.getAllUsers().getUserList().size() + 1;
        user.setId(id);
         
        this_userDAO.addUser(user);
         
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                                    .path("/{id}")
                                    .buildAndExpand(user.getId())
                                    .toUri();
         
        return ResponseEntity.created(location).build();
    }



}
