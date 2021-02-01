package Behaviors;

import Entities.Student;
import FileIO.FileProcess;

import java.util.ArrayList;

public class StudentManagement {
    final String PATH = "src/student.dat";
    ArrayList<Student> students = new ArrayList<Student>();

    public void add(Student s) {
        Object data = FileProcess.readFromFile(PATH);
        if(data instanceof ArrayList){
            students = (ArrayList<Student>) FileProcess.readFromFile(PATH);
        }
        students = students == null ? new ArrayList<>(): students;
        students.add(s);
        FileProcess.writeObjectToFile(students,PATH);
    }

    public Student getStudentByCode(int code) {
        Student student = new Student();
        for (Student s : students) {
            if (s.getId() == code) {
                student = s;
            }
        }
        return student;
    }

    public void show() {
        students = (ArrayList<Student>) FileProcess.readFromFile(PATH);
        for (Student s : students) {
            System.out.println(s.toString());
        }
    }
}
