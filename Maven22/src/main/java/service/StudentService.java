package service;

import entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAll();
    List<Student> getByName(String name);
    Student getById(int id);
    void addStudent(Student student);
}
