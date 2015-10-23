package com.mr_faton.test1.entity;

import javax.persistence.*;

/**
 * Description
 *
 * @author Mr_Faton
 * @since 23.10.2015
 */

@NamedQuery(name = "studentByEMail",
        query = "SELECT s FROM Student s WHERE s.eMail LIKE :email")

@Entity
@Table(name = "students")
public class Student {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "e_mail")
    private String eMail;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
}
