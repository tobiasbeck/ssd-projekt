package models;

import com.avaje.ebean.Model;

/**
 * Created by User on 18.05.2017.
 */
public class User extends Model{



    private String id;
        private String email;
        private String password;
        private String role;
        private String name;

        public User(String email, String password, String role, String name) {
            this.email = email;
            this.password = password;
            this.role = role;
            this.name = name;
        }

        public static Finder<Long, User> find = new Finder<Long, User>(User.class);

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

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

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
