package CPX.Mobile.Backend.demo2.service;

import CPX.Mobile.Backend.demo2.model.model_user;

public class userServise {
    
    public model_user getSubscriptionMessage (String stud) {
        
        model_user muser = new model_user();

        muser.setUser_name(stud + "OK Test");
        muser.setYear(100);

        return muser;

    }
}
