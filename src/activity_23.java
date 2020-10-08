import java.util.Scanner;
//Activity-23: Write a Java program that takes a number as input and prints its multiplication table upto 10
//Input a number: 8
//        Expected Output :
//        8 x 1 = 8
//        8 x 2 = 16
//        8 x 3 = 24
//        ...
//        8 x 10 = 80
public class activity_23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("nhap so a :");
        int a = in.nextInt();
        for(int i=1;i<=10;i++) {
            System.out.println(a+" x "+i+" = " +(a*i));
        }
    }
}
