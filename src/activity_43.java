import java.util.Scanner;

public class activity_43 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int i;
        System.out.println("dãy số chia hết cho 3 :");
        for(i=1;i<=100;i++) {
            if (i%3==0){
                System.out.print(+i+",");
            }
        }
        System.out.println("\n");
        System.out.println("dãy số chia hết cho 5:");
        for (i=1;i<=100;i++){
            if (i%5==0){
                System.out.print(+i+",");
            }
        }
        System.out.println("\n");
        System.out.println("dãy số chia hết cho cả 3 và 5:");
        for (i=1;i<=100;i++){
            if (i%3==0&i%5==0){
                System.out.print(i+",");
            }
        }
    }
}
