package midterm;


import java.util.Scanner;

public class test1 {

    public static final int x =2561;

    public static void main(String[] args) {
        int i = 1;
        for (; i <= 3;) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("กรุณากรอกข้อมูลปี พ.ศ. เกิดของคุณ : ");
            int y = scanner.nextInt();
                System.out.println("อายุของคุณคือ: " + (x - y));
            i++;
        }
    }


}//end class
