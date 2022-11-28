package loops;

import java.util.Scanner;

public class ForLoopExample {
    public static int validateUserName(String[] names,String userName)
    {
        int index=-1;
        for(int i=0;i<names.length;i++)
        {
            if(userName.equals(names[i])) {
                index=i;
                break;
            }
        }
        return index;
    }

    public static void main (String []args)
    {
        String [] userNames = {"ashish","bunny","charan","david","sukumar","archana","abhishek","swapna"};
        String [] passwords = {"as123","bu123","ch123","da123","su123","ar123","ab123","sw123"};
        String userName;
        String password;
        int userNameIndex;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user name");
        userName=sc.next();
        userNameIndex= validateUserName(userNames,userName);
        if(userNameIndex == -1)
            System.out.println("User doesn't exist");
        else
        {
            System.out.println("Enter password");
            password=sc.next();
            if(password.equals(passwords[userNameIndex]))
                System.out.println("Welcome "+ userName);
            else
                System.out.println("Invalid Password");

        }
    }
}
