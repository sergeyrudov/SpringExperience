package org.hibernate;

import hibernate_test.entity.Employee;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class GetUsersFromDB {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();


        try {

            Session session = factory.getCurrentSession();

            session.beginTransaction();

            List<Employee> emps = session.createQuery("from Employee where name = 'Alexander' AND salary > 700")
                    .getResultList();

            for (Employee e: emps) {
                System.out.println(e);
            }

        } finally {
            factory.close();
        }
    }
}
