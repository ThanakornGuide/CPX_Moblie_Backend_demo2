package CPX.Mobile.Backend.demo2.service;

import org.springframework.stereotype.Component;

import CPX.Mobile.Backend.demo2.model.model_user;

@Component
public class userServise {
    
    public model_user getSubscriptionMessage () {
        
        model_user muser = new model_user("new test");

        return muser;

    }
}
