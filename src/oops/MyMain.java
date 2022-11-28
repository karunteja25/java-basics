package oops;

import java.util.ArrayList;
import java.util.Scanner;

public class MyMain {
    public static void main(String []args) throws Exception {
        Student student1 = new Student();
        Admin admin = new Admin();
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> studentRecords =new ArrayList<>();
        Student s1 = new Student("Ankit","ankit123","male",40,50,70,160);
        studentRecords.add(s1);
        studentRecords.add(new Student("Shiva","shiva123","male",70,75,90,235));
        int choice = 0, breakLoop = 0;
        while (choice != 3) {
            System.out.println("Enter your choice :\n1.Admin\n2.Student\n3.Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter User Name : ");
                    admin.setUserName(sc.next());
                    if (admin.getUserName().equals("Admin")) {
                        System.out.println("Enter Password : ");
                        admin.setPassword(sc.next());
                        if (admin.getPassword().equals("admin123")) {
                            String adminChoice;

                            while (breakLoop != 1) {
                                System.out.println("Enter Your choice :\n1.Add Student\n2.Remove Student\n3.Update Student\n4.Display Student Details\n5.Back to login");
                                adminChoice = sc.next();
                                switch (adminChoice) {
                                    case "1" -> {
                                        studentRecords.add(admin.addStudent());
                                        System.out.println("Student added successfully ");
                                    }
                                    case "2" -> {
                                        System.out.println("Select the student you want to remove");
                                        studentRecords.remove(admin.removeStudent(studentRecords));
                                        System.out.println("Student removed successfully ");
                                    }
                                    case "3" -> {
                                        System.out.println("Select the student you want to update");
                                        studentRecords.set(admin.updateStudent(studentRecords), admin.addStudent());
                                        System.out.println("Student updated successfully ");
                                    }
                                    case "4" -> admin.displayStudentDetails(studentRecords);
                                    case "5" -> breakLoop = 1;
                                    default -> System.out.println("Invalid choice");
                                }
                            }
                        } else {
                            System.out.println("Invalid Password");
                        }
                    } else {
                        System.out.println("Invalid User Name");
                    }
                }
                case 2 -> {
                    System.out.println("Enter User Name : ");
                    student1.setUserName(sc.next());
                    if (admin.validateStudentUserName(studentRecords, student1.getUserName())) {
                        System.out.println("Enter Password : ");
                        student1.setPassword(sc.next());
                        if (admin.validateStudentPassword(studentRecords, student1.getPassword())) {
                            System.out.println(studentRecords.get(admin.searchStudent(studentRecords, student1.getUserName())));
                        } else
                            System.out.println("invalid password");
                    } else
                        System.out.println("invalid username");
                }
                case 3 -> System.out.println("Thank you");
                default -> System.out.println("invalid choice");
            }
        }
    }
}
