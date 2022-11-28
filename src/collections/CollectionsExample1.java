package collections;

import oops.Admin;
import oops.Student;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionsExample1 {
    public static void main(String[] args) throws Exception {
        Map<String, Student> studentMap = new HashMap<>();
        Map<Integer, String> loginMenu = new HashMap<>();
        loginMenu.put(1, "Admin");
        loginMenu.put(2, "Student");
        loginMenu.put(3, "Exit");
        Student student = new Student();
        Student s1 = new Student("Ankit", "ankit123", "male", 40, 50, 70, 160);
        Student s2 = new Student("Shiva", "shiva123", "male", 70, 75, 90, 235);
        studentMap.put(s1.userName, s1);
        studentMap.put(s2.userName, s2);
        Admin admin = new Admin();
        Scanner sc = new Scanner(System.in);
        int choice = 0, breakLoop = 0;
        while (choice != 3) {
            System.out.println("Enter your choice : " + loginMenu);
            choice = sc.nextInt();
            ArrayList<Student> list = new ArrayList<>(studentMap.values());
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
                                System.out.println("Enter Your choice :\n1.Search Student\n2.Add Student\n3.Remove Student\n4.Update Student\n5.Display Student Details\n6.Back to login");
                                adminChoice = sc.next();
                                ArrayList<Student> newList = new ArrayList<>(studentMap.values().stream().collect(Collectors.toList()));
                                switch (adminChoice) {
                                    case "1" -> {
                                        System.out.println("Enter Student Name");
                                        String name = sc.next();
                                        if(studentMap.containsKey(name))
                                            System.out.println(studentMap.get(name));
                                        else
                                            System.out.println("Student doesn't exist");
                                    }
                                    case "2" -> {
                                        studentMap.put(student.getUserName(), admin.addStudent());
                                        System.out.println("Student added successfully ");
                                    }
                                    case "3" -> {
                                        System.out.println("Select the student you want to remove");
                                        String key= newList.get(admin.removeStudent(newList)).getUserName();
                                        studentMap.remove(key);
                                        System.out.println("Student removed successfully ");
                                    }
                                    case "4" -> {
                                        System.out.println("Select the student you want to update");
                                        int studentKey = admin.updateStudent(newList);
                                        String key= (String) studentMap.keySet().toArray()[studentKey];
                                        studentMap.remove(key);
                                        Student updatedStudent=admin.addStudent();
                                        studentMap.put(updatedStudent.getUserName(),updatedStudent );
                                        System.out.println("Student updated successfully ");
                                    }
                                    case "5" -> admin.displayStudentDetails(newList);
                                    case "6" -> breakLoop = 1;
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
                    student.setUserName(sc.nextLine());
                    if (admin.validateStudentUserName(list, student.getUserName())) {
                        System.out.println("Enter Password : ");
                        student.setPassword(sc.nextLine());
                        if (admin.validateStudentPassword(list, student.getPassword())) {
                            ArrayList<Student> newList = new ArrayList<>(studentMap.values());
                            System.out.println(list.get(admin.searchStudent(newList, student.getUserName())));
                            System.out.println("Click 1 to change Password\nClick 2 to exit ");
                            switch(sc.nextLine())
                            {
                                case "1"-> {
                                    System.out.println("Enter old Password");
                                    String oldPassword = sc.next();

                                    if (admin.validateStudentPassword(list, oldPassword)) {
                                        System.out.println("Enter new Password");
                                        studentMap.put(student.getUserName(), admin.updateStudentPassword(studentMap.get(student.getUserName())));
                                        System.out.println("Password updated successfully");
                                    } else
                                        System.out.println("Password doesn't match");
                                }
                                case "2"->System.out.println("Thank you");
                                default -> System.out.println("Invalid choice");
                            }

                        } else
                            System.out.println("invalid password");
                    } else
                         System.out.println("User doesn't exist");

                }
                case 3 ->
                    System.out.println("Thank you");

                default -> System.out.println("invalid choice");
            }
        }
    }
}
