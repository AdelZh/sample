package sample;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Teacher {
    private String name;
    private String surname;
    private String email;
    private String password;

    public Teacher(String email) {
        this.email = email;
    }
}
