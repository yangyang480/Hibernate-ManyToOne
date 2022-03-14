package com.perscholas.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MyController {
    //we put all the method and logic here, and call them in app class

    public void createManytoone(){
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        factory.close();
        session.close();
    }

    public void InsertInfo()
    {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        //two method we can use, we can use insert query, or we also can use session buildin method.
        Department department1 = new Department();
        department1.setDname("HR");

        Department department2 = new Department();
        department2.setDname("Programmer");

        Department department3 = new Department();
        department3.setDname("Finnace");

        Teacher teacher1 = new Teacher();
        teacher1.setTeachername("Yangyang");
        teacher1.setSalary("50000");
        teacher1.setDepartment(department2);

        Teacher teacher2 = new Teacher();
        teacher2.setTeachername("Kyle");
        teacher2.setSalary("60000");
        teacher2.setDepartment(department2); //department2 has two teacher

        Teacher teacher3 = new Teacher();
        teacher3.setTeachername("Crastal");
        teacher3.setSalary("65000");
        teacher3.setDepartment(department1); //department1 has one teacher

        session.save(department1);
        session.save(department2);
        session.save(department3);
        session.save(teacher1);
        session.save(teacher2);
        session.save(teacher3);

        t.commit();
        session.close();
        factory.close();
    }


}
