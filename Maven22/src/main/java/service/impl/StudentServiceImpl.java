package service.impl;

import db.DBService;
import entity.Student;
import service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    @Override
    public List<Student> getAll() {
        return DBService.getAll();
    }

    @Override
    public List<Student> getByName(String name) {
        return DBService.getByName(name);
    }

    @Override
    public Student getById(int id) {
        return DBService.getById(id);
    }

    @Override
    public void addStudent(Student student) {
        DBService.addStudent(student);
    }
}
