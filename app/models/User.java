package models;

import com.avaje.ebean.Model;

/**
 * Created by tobibeck on 13.06.17.
 */
public class User extends Model {

    private String email;
    private String password;
    private String name;

    private String position;

    public static Finder<Long,User> find = new Finder<Long,User>(User.class);


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
