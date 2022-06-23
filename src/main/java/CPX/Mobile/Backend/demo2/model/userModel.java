package CPX.Mobile.Backend.demo2.model;

import lombok.Data;

@Data
public class userModel {

    public userModel() {
        
    }


    public userModel(int id,String username,String lastName,String numberphone) {
        this.id = id;
        this.username = username;
        this.lastName = lastName;
        this.numberphone = numberphone;
    }

    private int id;
    private String username;
    private String lastName;
    private String numberphone;

    @Override
    public String toString() {
        return "User : id= "+id+ ",username="+username+",lastName="+lastName+",numberphone="+numberphone + "";
    }


}
