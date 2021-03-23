package org.hibernate;

import hibernate_test.entity.Employee;
import org.hibernate.cfg.Configuration;


public class ModifyObjectInDB {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();


        try {

            Session session = factory.getCurrentSession();

            session.beginTransaction();

            Employee emp = session.get(Employee.class, 1);
            emp.setSalary(1500);

            session.getTransaction().commit();
            System.out.println("DONE!");


        } finally {
            factory.close();
        }
    }
}
