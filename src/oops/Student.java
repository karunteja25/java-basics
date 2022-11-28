package oops;

public class Student extends User{

    public int marks1;
   public int marks2;
   public int marks3;
    public int total;
    public Student(){}
    public Student(String userName,String password,String gender,int marks1, int marks2, int marks3, int total) {
        super(userName, password, gender);
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
        this.total = total;
    }

    public int getMarks1() {
        return marks1;
    }

    public void setMarks1(int marks1) {
        this.marks1 = marks1;
    }

    public int getMarks2() {
        return marks2;
    }

    public void setMarks2(int marks2) {
        this.marks2 = marks2;
    }

    public int getMarks3() {
        return marks3;
    }

    public void setMarks3(int marks3) {
        this.marks3 = marks3;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(int total) {

        this.total = getMarks1()+getMarks2()+getMarks3();
    }

    @Override
    public String toString() {
        return
                "Student Name='" + userName + '\'' +
                ", gender='" + gender + '\'' +
                "  marks1=" + marks1 +
                ", marks2=" + marks2 +
                ", marks3=" + marks3 +
                ", total=" + total;
    }
}
