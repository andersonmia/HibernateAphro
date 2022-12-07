package rw.ac.rca.sms.orm;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "student")
public class Student extends Person {

    private String registrationNumber;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "student")
    private List<Course> courses;

    @ManyToOne
    @JoinColumn(name = "address-id")
    private Address address;


//    public Student(String name, String registrationNumber, Date dateOfBirth) {
//        this.name = name;
//        this.registrationNumber = registrationNumber;
//        this.dateOfBirth = dateOfBirth;
//    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
    public List<Course> getCourses() {
        return courses;
    }
    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

}
