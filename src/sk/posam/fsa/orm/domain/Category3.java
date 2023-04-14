package sk.posam.fsa.orm.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Access(AccessType.PROPERTY)
public class Category3 {
    private Long id;
    private String name;
    private Date lastUpdated;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    public Long getId() {
        return id;
    }



    //    @Column(name = "name")// netreba
    public String getName() {
        return name;
    }

    @Column(name = "last_update")
    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public void setName(String name) {
        this.name = name;
    }



    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}
