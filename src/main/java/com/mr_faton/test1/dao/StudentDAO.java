package com.mr_faton.test1.dao;

import com.mr_faton.test1.entity.Student;

import java.sql.SQLException;
import java.util.List;

/**
 * Description
 *
 * @author Mr_Faton
 * @since 23.10.2015
 */
public interface StudentDAO {
    void save(Student student) throws SQLException;
    void update(Student student) throws SQLException;
    Student saveOrUpdate(Student student) throws SQLException;
    void delete(Student student) throws SQLException;

    Student getById(int id) throws SQLException;

    List<Student> getByNameByNamedQuery(String name) throws SQLException;
    List<Student> getByNameByJPQL(String name) throws SQLException;
    List<Student> getByNameByCriteria(String name) throws SQLException;
}
