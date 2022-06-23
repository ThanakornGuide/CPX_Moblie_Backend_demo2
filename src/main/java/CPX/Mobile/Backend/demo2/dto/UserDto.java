package CPX.Mobile.Backend.demo2.dto;

import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    
    @Id
    private int id;
    private String username;
    private String lastName;


}
