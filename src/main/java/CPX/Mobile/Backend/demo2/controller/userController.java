package CPX.Mobile.Backend.demo2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import CPX.Mobile.Backend.demo2.model.model_user;
import CPX.Mobile.Backend.demo2.service.userServise;

@RestController
public class userController {
    
    private userServise userServise;

    @GetMapping("/user")
    public String outputSS(){

        model_user user = new model_user();
        user = userServise.getSubscriptionMessage("Test Name");

        String txt_name = (user.getUser_name()).toString() + (user.getYear()).toString();

        return txt_name;
    }
    
}
