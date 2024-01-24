package com.example.thymeleaf_spring_boot_db.entities;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "students", schema = "school5bhel", catalog = "")
public class Student {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "firstname")
    private String firstname;
    @Basic
    @Column(name = "lastname")
    private String lastname;
    @Basic
    @Column(name = "dateofbirth")
    private Date dateofbirth;
    @Basic
    @Column(name = "sex")
    private String sex;
    @Basic
    @Column(name = "height")
    private double height;
    @ManyToOne
    @JoinColumn(name = "schoolclass_id", referencedColumnName = "id", nullable = false)
    private Schoolclass schoolclassesBySchoolclassId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Double.compare(student.height, height) == 0 && Objects.equals(firstname, student.firstname) && Objects.equals(lastname, student.lastname) && Objects.equals(dateofbirth, student.dateofbirth) && Objects.equals(sex, student.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstname, lastname, dateofbirth, sex, height);
    }

    public Schoolclass getSchoolclassesBySchoolclassId() {
        return schoolclassesBySchoolclassId;
    }

    public void setSchoolclassesBySchoolclassId(Schoolclass schoolclassesBySchoolclassId) {
        this.schoolclassesBySchoolclassId = schoolclassesBySchoolclassId;
    }
}
