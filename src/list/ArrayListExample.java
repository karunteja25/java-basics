//package list;
//
//import java.util.*;
//
//public class ArrayListExample {
//    public static ArrayList<String> addUser(ArrayList<String> arr,String userName,String password)
//    {
//        ArrayList<String> list=new ArrayList<>();
//
//        arr.add(arr.size(), String.valueOf(new String[]{userName, password}));
//        return arr;
//    }
//    public static ArrayList<String> removeUser(ArrayList<String> arr,int index)
//    {
//
//        arr.remove(index);
//        return arr;
//    }
//    public static void main (String []args)
//    {
//        ArrayList<ArrayList<String[]>> userDetails;
//        String [][] users = {{"ashish","as123"},{"bunny","bu123"},{"charan","ch123"},{"david","da123"},{"sukumar","su123"},{"archana","ar123"},{"abhishek","ab123"},{"swapna","sw123"}};
//        ArrayList<ArrayList<String>> names= new ArrayList<ArrayList<String>>();
//        //names.add(new ArrayList<>());
//        Collections.addAll(names,users);
//        for(int i=0;i< 8;i++)
//        {
//            for(int j=0;j<1;j++)
//              names.get(i).add(users[i][j]);
//        }
//        System.out.println(names);
//        String userName;
//        String password;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter user name");
//        userName=sc.next();
//
//        if(!names.contains(userName))
//            System.out.println("User doesn't exist");
//        else
//        {
//            System.out.println("Enter password");
//            password=sc.next();
//            if(names.contains(password))
//                System.out.println("Welcome "+ userName);
//            else
//                System.out.println("Invalid Password");
//
//        }
////        System.out.println("Enter user name");
////        userName=sc.next();
////        System.out.println("Enter password");
////        password=sc.next();
////        //userDetails=(addUser(names,userName,password));
////        System.out.println(userDetails);
//    }
//}
