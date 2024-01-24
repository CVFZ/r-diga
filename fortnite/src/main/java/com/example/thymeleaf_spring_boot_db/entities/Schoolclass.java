package com.example.thymeleaf_spring_boot_db.entities;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "schoolclasses", schema = "school5bhel", catalog = "")
public class Schoolclass {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "room")
    private String room;
    @OneToMany(mappedBy = "schoolclassesBySchoolclassId")
    private List<Student> studentsById;

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

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Schoolclass that = (Schoolclass) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(room, that.room);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, room);
    }

    public List<Student> getStudentsById() {
        return studentsById;
    }

    public void setStudentsById(List<Student> studentsById) {
        this.studentsById = studentsById;
    }
}
