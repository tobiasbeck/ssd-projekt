package models;

import com.avaje.ebean.Model;
import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;
import java.util.List;;

/**
 * Created by tobibeck on 18.05.17.
 */
@Entity
public class Project {

    @Id
    @Column(name="project_id")
    private long id;

    private String name;
    private String description;

    /*@OneToMany(mappedBy = "User")
    private User controller;*/





}
