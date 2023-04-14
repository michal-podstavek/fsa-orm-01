package sk.posam.fsa.orm.domain;

import java.util.Date;

public class Actor {
    private Long id;
    private String firstName;
    private String lastName;
    private Date lastUpdated;



    @Override
    public String toString() {
        return "Actor{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", lastUpdated=" + lastUpdated +
                '}';
    }
}
