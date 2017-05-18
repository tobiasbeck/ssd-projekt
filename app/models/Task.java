package models;

/**
 * Created by tobibeck on 18.05.17.
 */
import com.avaje.ebean.Model;
import com.sun.javafx.beans.IDProperty;

import javax.persistence.*;
import java.util.List;

@Entity
public class Task {

    @Id
    @Column(name="task_id")
    private long id;

    private String title;
    private String description;
    private int duration;

    @OneToMany(mappedBy = "Project")
    private Project project;

}
