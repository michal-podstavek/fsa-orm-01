package sk.posam.fsa.orm.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "category", schema = "public")
@Access(AccessType.FIELD)
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Long id;

//    @Column(name = "name")// netreba
    private String name;

    @Column(name = "last_update")
    private Date lastUpdated;

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastUpdated=" + lastUpdated +
                '}';
    }
}
