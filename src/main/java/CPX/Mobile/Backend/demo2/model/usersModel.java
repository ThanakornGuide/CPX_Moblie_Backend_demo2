package CPX.Mobile.Backend.demo2.model;

import java.util.ArrayList;
import java.util.List;

public class usersModel {
    
    private List<userModel> userList;

    public List<userModel> getUserList() {
        if(userList == null) {
            userList = new ArrayList<>();
        }

        return userList;
    }

    public void setUserList(List<userModel> userList) {
        this.userList = userList;
    }

}
