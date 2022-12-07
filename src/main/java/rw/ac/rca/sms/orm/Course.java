package rw.ac.rca.sms.orm;

import javax.persistence.*;

@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int maxMark;
    private int numberOfPeriods;
    @ManyToOne
    @JoinColumn(name = "instructor-id")
    private Instructor instructor;
    @ManyToOne
    @JoinColumn(name = "student-id")
    private Student student;


    public void setStudent(Student student) {
        this.student = student;
    }

    public Course(String name, int numberOfPeriods) {
        this.name = name;
        this.numberOfPeriods = numberOfPeriods;
    }


    public Student getStudent() {
        return student;
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

    public int getMaxMark() {
        return maxMark;
    }

    public void setMaxMark(int maxMark) {
        this.maxMark = maxMark;
    }

    public int getNumberOfPeriods() {
        return numberOfPeriods;
    }

    public void setNumberOfPeriods(int numberOfPeriods) {
        this.numberOfPeriods = numberOfPeriods;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
}
