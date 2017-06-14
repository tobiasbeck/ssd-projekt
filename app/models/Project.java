package models;

import com.avaje.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Created by tobibeck on 14.06.17.
 */
@Entity
public class Project extends Model {
    @Id
    @Column(name = "project_id")
    private Long id;

    private String name;
    private String description;

    @OneToOne
    private Customer buyer;

    private String buyertmp;

    @OneToOne
    private User creator;

    private String creatortmp;

    public static Finder<Long,Project> find = new Finder<Long,Project>(Project.class);

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Customer getBuyer() {
        return buyer;
    }

    public void setBuyer(Customer buyer) {
        this.buyer = buyer;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public String getBuyertmp() {
        return buyertmp;
    }

    public void setBuyertmp(String buyertmp) {
        this.buyertmp = buyertmp;
    }

    public String getCreatortmp() {
        return creatortmp;
    }

    public void setCreatortmp(String creatortmp) {
        this.creatortmp = creatortmp;
    }
}
