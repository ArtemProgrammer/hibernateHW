package entity;

import javax.persistence.*;

@Entity
@Table(name = "Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "year_of_admission")
    private int yearOfAdmission;

    public Student(){}

    public Student(String fullName, int yearOfAdmission) {
        this.fullName = fullName;
        this.yearOfAdmission = yearOfAdmission;
    }

    public Student(int id, String fullName, int yearOfAdmission) {
        this.id = id;
        this.fullName = fullName;
        this.yearOfAdmission = yearOfAdmission;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYearOfAdmission() {
        return yearOfAdmission;
    }

    public void setYearOfAdmission(int yearOfAdmission) {
        this.yearOfAdmission = yearOfAdmission;
    }

    @Override
    public String toString() {
        return "model.Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", yearOfAdmission=" + yearOfAdmission +
                '}';
    }
}
