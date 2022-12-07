package rw.ac.rca.sms.mainApp;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import rw.ac.rca.sms.orm.Address;
import rw.ac.rca.sms.orm.Course;
import rw.ac.rca.sms.orm.Instructor;
import rw.ac.rca.sms.orm.Student;

import java.util.Date;

public class Starter {
    //private static SessionFactory factory;
    public static  void main(String[] args){

        Address address = new Address("Nyabihu","KN4 StB");

//        Student st1 = new Student("Mia","rca0zgv",new Date());
//        Student st2 = new Student("Anderson","rca086bgh",new Date());
//
//        Instructor inst1 = new Instructor("Leo","1 1996 7 345", "+25078392402",new Date());
//        inst1.setAddress(address);
//        Instructor inst2 = new Instructor("John","1 199687 345", "+25078391002",new Date());
//        inst2.setAddress(address);

        Course course1 = new Course("Maths",5);
//        course1.setInstructor(inst1);
        Course course2 = new Course("English",3);
//        course2.setInstructor(inst1);
//        course1.setStudent(st1);
//        course2.setStudent(st1);

        //loading config file
        System.out.println("loading configuration file...........");
        Configuration config = new Configuration();
        config.configure();

        //creating session object
        System.out.println("Opening the session.......");
        try {
            @SuppressWarnings("deprecation")

            SessionFactory factory = config.buildSessionFactory();
            Session session = factory.openSession();

            //open transaction
            System.out.println("Beginning transactions");
            Transaction transaction = session.beginTransaction();

            //saving objects
            session.saveOrUpdate(address);

            session.saveOrUpdate(course1);
            session.saveOrUpdate(course2);

//            session.saveOrUpdate(inst1);
//            session.saveOrUpdate(inst2);
//
//            session.saveOrUpdate(st1);
//            session.saveOrUpdate(st2);

            //committing transactions
            System.out.println("Committing transactions");
            transaction.commit();

            //closing connections
            System.out.println("Before closing the session");
            session.close();
            factory.close();

            System.out.println("Execution completed........");

        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }
}
