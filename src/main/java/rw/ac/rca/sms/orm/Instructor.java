package rw.ac.rca.sms.orm;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Entity
@Table(name = "instructor")
public class Instructor extends Person {
    private char gender;
    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToMany( cascade = CascadeType.ALL , mappedBy = "instructor")
    private List<Course> courses;

    public Instructor(){}


    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

<<<<<<< HEAD
=======
//    public void setCourses(List<Course> courses) {
//        this.courses = courses;
//    }
>>>>>>> master


    public char getGender() {
        return gender;
    }

    public Address getAddress() {
        return address;
    }
<<<<<<< HEAD
=======

//    public List<Course> getCourses() {
//        return courses;
//    }

>>>>>>> master
}