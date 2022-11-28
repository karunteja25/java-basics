package oops;

import java.util.ArrayList;

public interface Administration {
    Student addStudent() throws Exception;
    int removeStudent(ArrayList<Student> studentList);
    int updateStudent(ArrayList<Student> studentList);
    Student updateStudentPassword(Student student);
    void displayStudentDetails(ArrayList<Student> studentList);
    boolean validateStudentUserName(ArrayList<Student> studentList,String studentUserName);
    boolean validateStudentPassword(ArrayList<Student> studentList,String studentPassword);
    int searchStudent(ArrayList<Student> studentList,String studentUserName);
}
