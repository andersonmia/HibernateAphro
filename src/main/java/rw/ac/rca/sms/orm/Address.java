package rw.ac.rca.sms.orm;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "address")
public class Address {
    private String name;

    private String street;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "address")
    private Set<Student> students;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "address")
    private Set<Instructor> instructors;


    public Address(String name, String street) {
        this.name = name;
        this.street = street;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

}