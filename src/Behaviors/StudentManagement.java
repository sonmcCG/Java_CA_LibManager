package Behaviors;

import Entities.Student;

import java.util.ArrayList;

public class StudentManagement {
    ArrayList<Student> students = new ArrayList<Student>();
    public void add(Student s){
        students.add(s);
    }
    public Student getStudentByCode(int code){
        Student student = new Student();
        for (Student s:students
             ) {
            if(s.getId() == code){
              student = s;
            }
        }
        return student;
    }
    public void show(){
        for (Student s: students
             ) {
            System.out.println(s.toString());
        }
    }
}
