package rw.ac.rca.sms.orm;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Entity
@Table(name = "instructor")
public class Instructor extends Person {

    private String nid;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "instructor")
    private List<Course> courses;
    @ManyToOne
    @JoinColumn(name = "address-id")
    private Address address;

    public Instructor() {
    }

//    public Instructor(String name, String nid, String phoneNumber, Date dateOfBirth) {
//        this.name = name;
//        this.nid = nid;
//        this.phoneNumber = phoneNumber;
//        this.dateOfBirth = dateOfBirth;
//    }


    public String getNid() {
        return nid;
    }
    public void setNid(String nid) {
        this.nid = nid;
    }
    public List<Course> getCourses() {
        return courses;
    }
    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

}
