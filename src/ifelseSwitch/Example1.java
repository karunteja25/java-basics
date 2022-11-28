package ifelseSwitch;

import java.util.Arrays;
import java.util.Scanner;

public class Example1 {
    public static void main (String []args)
    {
        String [] userNames = {"ashish","bunny","charan","david","sukumar","archana","abhishek","swapna"};
        String [] passwords = {"as123","bu123","ch123","da123","su123","ar123","ab123","sw123"};
        String userName= "";
        String password="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user name");
        userName=sc.next();
        if  (Arrays.asList(userNames).contains(userName))
        {
            System.out.println("Enter password");
            password=sc.next();
            switch (userName) {
                case "ashish":
                    if (password.equals(passwords[0]))
                        System.out.println("Welcome Ashish");
                    else
                        System.out.println("Invalid password");
                break;
                case "bunny":
                    if (password.equals(passwords[1]))
                        System.out.println("Welcome Bunny");
                    else
                        System.out.println("Invalid password");
                break;
                case "charan":
                    if (password.equals(passwords[2]))
                        System.out.println("Welcome Charan");
                    else
                        System.out.println("Invalid password");
                break;
                case "david":
                    if (password.equals(passwords[3]))
                        System.out.println("Welcome David");
                    else
                        System.out.println("Invalid password");
                break;
                case "sukumar":
                    if (password.equals(passwords[4]))
                        System.out.println("Welcome Sukumar");
                    else
                        System.out.println("Invalid password");
                break;
                case "archana":
                    if (password.equals(passwords[5]))
                        System.out.println("Welcome Archana");
                    else
                        System.out.println("Invalid password");
                    break;
                case "abhishek":
                    if (password.equals(passwords[6]))
                        System.out.println("Welcome Abhishek");
                    else
                        System.out.println("Invalid password");
                    break;
                case "swapna":
                    if (password.equals(passwords[7]))
                        System.out.println("Welcome Swapna");
                    else
                        System.out.println("Invalid password");
                    break;
                default:
                    System.out.println("User doesn't exist");
            }

        }
        else
            System.out.println("User doesn't exist");
    }
}
