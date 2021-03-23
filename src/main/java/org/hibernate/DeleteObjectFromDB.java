package org.hibernate;

import hibernate_test.entity.Employee;
import org.hibernate.cfg.Configuration;

public class DeleteObjectFromDB {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();


        try {

            Session session = factory.getCurrentSession();

            session.beginTransaction();

           /* Employee employee = session.get(Employee.class, 9);
            session.delete(employee);*/

            session.createQuery("delete Employee where name='Alexander'").executeUpdate();

            session.getTransaction().commit();

            System.out.println("DONE!");
            
        } finally {
            factory.close();
        }
    }
}
