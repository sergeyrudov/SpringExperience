package org.hibernate;

import hibernate_test.entity.Employee;
import org.hibernate.cfg.Configuration;

public class TestHibernate {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();


        try {

            Session session = factory.getCurrentSession();
            Employee emp = new Employee("Elena", "Petrova", "Sales", 550);

            // Save employee object to DB
            session.beginTransaction();
            session.save(emp);
            session.getTransaction().commit();

            // Get employee from DB
            int myId = emp.getId();
            session = factory.getCurrentSession();
            session.beginTransaction();

            Employee employee = session.get(Employee.class, myId);
            session.getTransaction().commit();
            System.out.println(employee);

        } finally {
            factory.close();
        }
    }
}
