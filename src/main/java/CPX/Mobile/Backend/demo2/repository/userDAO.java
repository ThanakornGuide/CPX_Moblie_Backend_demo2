package CPX.Mobile.Backend.demo2.repository;

import org.springframework.stereotype.Repository;

import CPX.Mobile.Backend.demo2.model.userModel;
import CPX.Mobile.Backend.demo2.model.usersModel;

@Repository
public class userDAO {
    
    private static usersModel list = new usersModel();
        
    static{
        list.getUserList().add(new userModel(1, "name", "lastName", "0123456789"));
        list.getUserList().add(new userModel(2, "name2", "lastName2", "123456789"));
        list.getUserList().add(new userModel(3, "name3", "lastName3", "234567890"));
    }

    public usersModel getAllUsers() {
        return list;
    }

    public void addUser(userModel user) {
        list.getUserList().add(user);
    } 

}
