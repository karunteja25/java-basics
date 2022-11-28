package oops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Admin extends User implements Administration{

    Student student =new Student();

    public Admin() {
        super();
    }
    Scanner sc= new Scanner(System.in);
    BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
    int i=1;
    @Override
    public Student addStudent() throws Exception {
        Student student=new Student();
        System.out.println("Enter Student name");
        String name= reader.readLine();
        student.setUserName(name);
        System.out.println("Enter Student password");
        student.setPassword(reader.readLine());
        System.out.println("Enter Student gender");
        student.setGender(reader.readLine());
        System.out.println("Enter Student marks1");
        student.setMarks1(sc.nextInt());
        System.out.println("Enter Student marks2");
        student.setMarks2(sc.nextInt());
        System.out.println("Enter Student marks3");
        student.setMarks3(sc.nextInt());
        student.setTotal(this.student.getMarks1()+ this.student.getMarks2()+ this.student.getMarks3());

        return student;

    }

    @Override
    public int removeStudent(ArrayList<Student> studentList) {
        Iterator<Student> itr=studentList.iterator();

        while(itr.hasNext())
        {
            System.out.println (i+"."+itr.next());
            i++;
        }
        i=1;
        int index= sc.nextInt();
        return (index-1);
    }

    @Override
    public int updateStudent(ArrayList<Student> studentList) {
        return removeStudent(studentList);
    }

    @Override
    public Student updateStudentPassword(Student student) {
        student.setPassword(sc.next());
        return student;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "s1=" + student +
                '}';
    }

    @Override
    public void displayStudentDetails(ArrayList<Student> studentList) {
        Iterator itr=studentList.iterator();
        int i=1;
        while(itr.hasNext())
        {
            System.out.println (i+"."+itr.next());
            i++;
        }

    }

    @Override
    public boolean validateStudentUserName(ArrayList<Student> studentList,String studentUserName) {
        boolean result=false;
        for(int i=0;i<studentList.size();i++)
        {
            if(studentList.get(i).getUserName().equals(studentUserName))
            {
                result= true;
                break;
            }
        }
        return result;
    }

    @Override
    public boolean validateStudentPassword(ArrayList<Student> studentList,String studentPassword) {
        boolean result=false;
        for(int i=0;i<studentList.size();i++)
        {
            if(studentList.get(i).getPassword().equals(studentPassword))
            {
                result= true;
                break;
            }
        }
        return result;
    }

    @Override
    public int searchStudent(ArrayList<Student> studentList, String studentUserName) {
        int index=-1;
        for(int i=0;i<studentList.size();i++)
        {
            if(studentList.get(i).getUserName().equals(studentUserName))
            {
                index=i;
                break;
            }
        }
        return index;
    }
}
