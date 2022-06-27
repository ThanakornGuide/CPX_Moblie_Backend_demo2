package CPX.Mobile.Backend.demo2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customer")
public class userModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(name = "user_name",nullable = false)
    @NotNull(message = "username is null")
    @Size(min = 2,message = "username should at least 2 characters")
    private String username;

    @Column(name = "last_Name",nullable = false)
    @NotNull(message = "lastName should not empty")
    @Size(min = 2,message = "lastName should at least {min} characters")
    private String lastName;
    
    @Column(name = "email")
    @Email(message = "must be a well-formed email address")
    @NotEmpty(message = "email should not empty")
    private String email;

}
