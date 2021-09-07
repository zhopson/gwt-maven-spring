/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package my.testapp.gwtmavenspring.dao;

import my.testapp.gwtmavenspring.models.People;
import org.hibernate.Session;
import org.hibernate.Transaction;
import my.testapp.gwtmavenspring.utils.HibernateSessionFactoryUtil;
import java.util.List;
/**
 *
 * @author MikhailovAN
 */
public class PeopleDao {
    public People findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(People.class, id);
    }

    public void save(People people) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(people);
        tx1.commit();
        session.close();
    }

    public void update(People people) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(people);
        tx1.commit();
        session.close();
    }

    public void delete(People people) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(people);
        tx1.commit();
        session.close();
    }

    public People findAutoById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(People.class, id);
    }

    public List<People> findAll() {
        List<People> peoples = (List<People>)  HibernateSessionFactoryUtil.getSessionFactory().openSession().createQuery("From People").list();
        return peoples;
    }
}
