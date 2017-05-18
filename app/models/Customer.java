package models;

/**
 * Created by tobibeck on 18.05.17.
 */
import com.avaje.ebean.Model;
import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;
import java.util.List;

@Entity
public class Customer {
    @Id
    @Column(name="customer_id")
    private long ID;

    private String name;
    private String address;
    private String phone;
    private String email;
    private String company;

    public Customer(long ID, String name, String address, String phone, String email, String company) {
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.company = company;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
