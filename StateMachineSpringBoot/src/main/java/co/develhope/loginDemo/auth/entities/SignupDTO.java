package co.develhope.loginDemo.auth.entities;

import lombok.Data;

@Data
public class SignupDTO {

    private String name;
    private String surname;
    private String email;
    private String password;

}
