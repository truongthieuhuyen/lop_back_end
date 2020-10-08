import java.util.Scanner;

public class activity_22 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("nhap n :");

//        String n= in.nextLine();
//        System.out.println(n + " + " + n + n + " + " + n + n + n + " = "
//                + (Integer.parseInt(n) + Integer.parseInt(n + n) + Integer.parseInt(n + n + n)));

        int n =in.nextInt();
        int nn = Integer.parseInt("" +n+n);
        int nnn = Integer.parseInt("" +n+n+n);
        int tong = n +nn + nnn ;
        System.out.printf(n + " + " + n + n + " + " + n + n + n + " = %d",tong);

//        System.out.printf("%d + %d%d  + %d%d%d =",n,n,n,n,n,n,);
    }
    }
