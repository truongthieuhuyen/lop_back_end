import java.util.Scanner;

public class activity_52 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Input length :");
        int n= scanner.nextInt();
        int array[]=new int[n] ;

        for (int index=0;index<n-1;index++) {
            System.out.print("array["+index+"] =");
            index = scanner.nextInt();
        }

        
        // In ra màn hình Console số phần tử của mảng.
//        System.out.println("Array Length=" + a.length);

        // In ra phần tử tại chỉ số 3 (Phần tử thứ 4 trong mảng)
//        System.out.println("phần tử thứ 4 :"+a[3]);

        // Sử dụng vòng lặp for để in ra các phần tử trong mảng.
//            for (int i=0;i<a.length;i++){
//                System.out.println("a["+i+"] =" +a[i]);
//            }
//            for (int element:a){
//                System.out.println(a[i]);
//            }

        // Sử dụng vòng lặp for để gán giá trị cho các phần tử của mảng.
//        for (int index = 0; index < a.length; index++) {
//            a[index] = index * index + index;
//
//        }System.out.println(a[3]);
    }


}
