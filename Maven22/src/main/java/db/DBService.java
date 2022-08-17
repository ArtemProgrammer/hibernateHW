package db;

import hUtil.HibernateUtil;
import entity.Student;
import java.util.ArrayList;
import java.util.List;

public class DBService {
    public static List<Student> getAll() {
        return (List<Student>) HibernateUtil.getSession().createQuery("from Student").list();
    }

    public static List<Student> getByName(String name) {
        List<Student> students = new ArrayList<>();
        for (Student student : getAll()) {
            if (student.getFullName().equals(name)) {
                students.add(student);
            }
        }
        return students;
    }

    public static Student getById(int id) {
        return (Student) HibernateUtil.getSession().get(Student.class, id);
    }

    public static void addStudent(Student student) {
        HibernateUtil.getSession().save(student);
    }
}
