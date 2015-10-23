package com.mr_faton.test1.dao.impl;

import com.mr_faton.test1.dao.StudentDAO;
import com.mr_faton.test1.entity.Student;

import javax.persistence.EntityManager;
import java.sql.SQLException;
import java.util.List;

/**
 * Description
 *
 * @author Mr_Faton
 * @since 23.10.2015
 */
public class StudentDAOReal implements StudentDAO {
    final EntityManager em;

    public StudentDAOReal(EntityManager em) {
        this.em = em;
    }


    @Override
    public void save(Student student) throws SQLException {
        em.persist(student);
    }

    @Override
    public void update(Student student) throws SQLException {
        em.merge(student);
    }


    // It's desirable to use this one method in replace to save and update methods
    @Override
    public Student saveOrUpdate(Student student) throws SQLException {
        return em.merge(student);
    }

    @Override
    public void delete(Student student) throws SQLException {
        em.remove(student);
    }

    @Override
    public Student getById(int id) throws SQLException {
        return em.find(Student.class, id);
    }




    @Override
    public List<Student> getByNameByNamedQuery(String name) throws SQLException {
        return null;
    }

    @Override
    public List<Student> getByNameByJPQL(String name) throws SQLException {
        return null;
    }

    @Override
    public List<Student> getByNameByCriteria(String name) throws SQLException {
        return null;
    }
}
