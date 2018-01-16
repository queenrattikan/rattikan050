package midterm;

import java.util.Scanner;

public class test2 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String id = getID();
        String name = getName();
        String salary = getSalary();
        String OverTime = getOverTime();

        System.out.println("รวม :"+(salary+OverTime));
    }
    private static String getID(){
        System.out.print("Enter employee id: ");
        return scanner.nextLine();
    }
    private static String getName(){
        System.out.print("Enter employee name: ");
        return scanner.nextLine();
    }
    private static String getSalary(){
        System.out.print("Enter salary: ");
        return scanner.nextLine();
    }
    private static String getOverTime(){
        System.out.print("Enter overtime: ");
        return scanner.nextLine();
    }



}//end class
