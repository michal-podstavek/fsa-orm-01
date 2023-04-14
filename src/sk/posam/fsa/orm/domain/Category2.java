package sk.posam.fsa.orm.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Access(AccessType.FIELD)
public class Category2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Long id;

//    @Column(name = "name")// netreba
    private String name;

    @Column(name = "last_update")
    private Date lastUpdated;

    @Transient
    private User user;

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastUpdated=" + lastUpdated +
                '}';
    }
}
