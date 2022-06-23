package CPX.Mobile.Backend.demo2.model;

import lombok.Data;

@Data;
public class userModel {
    private int id;
    private String username;
    private String surname;
    private String numberphone;

    public userModel(int id,String username,String surname,String numberphone) {
        this.id = id;
        this.username = username;
        this.surname = surname;
        this.numberphone = numberphone;
    }

    
}
