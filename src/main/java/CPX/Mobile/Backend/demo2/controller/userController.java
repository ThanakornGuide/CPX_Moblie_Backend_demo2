package CPX.Mobile.Backend.demo2.controller;

import org.springframework.web.bind.annotation.RestController;

import CPX.Mobile.Backend.demo2.model.model_user;
import CPX.Mobile.Backend.demo2.service.userServise;

@RestController
public class userController {
    
    //protected userServise userServise;

    public String outputSS(){

        model_user user = new model_user();
        userServise servise = new userServise();

        user = servise.getSubscriptionMessage("Test Name");

        String txt_name = user.getUser_name().toString();
        return txt_name;
    }
    
}
