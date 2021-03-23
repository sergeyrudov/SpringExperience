package org.hibernate;

import hibernate_test.entity.Employee;
import org.hibernate.cfg.Configuration;

public class QueryToModifyObjects {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();


        try {

            Session session = factory.getCurrentSession();

            session.beginTransaction();

            session.createQuery("update Employee set salary=900 where name='Alexander'").executeUpdate();

            session.getTransaction().commit();

            System.out.println("DONE!");


        } finally {
            factory.close();
        }
    }

}
