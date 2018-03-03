package model;

/**
 * Created by Illya Havrulyk on 2/22/2018.
 */

public class User {
    private String firstName;
    private String lastName;
    private String password;
    private String login;
    private Gender gender;

    public User(String firstName, String lastName, String password, String login, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.login = login;
        this.gender = gender;
    }
}
