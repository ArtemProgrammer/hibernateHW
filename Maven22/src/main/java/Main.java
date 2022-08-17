import entity.Student;
import service.StudentService;
import service.impl.StudentServiceImpl;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentServiceImpl();
        System.out.println("Get all:");
        studentService.getAll();
        System.out.println("=================================");
        System.out.println("Get by id:");
        studentService.getById(11);
        System.out.println("=================================");
        System.out.println("Get by name:");
        studentService.getByName("Ivan");
        studentService.addStudent(new Student("Klava", 7000));
    }
}
