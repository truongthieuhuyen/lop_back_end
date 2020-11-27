package lesson9_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class AppTest_9 {
    public static void main(String[] args) {
        EmployeeManagement employeeManagement = new EmployeeManagement();
        employeeManagement.printAll();

        System.out.println("Max age is "+employeeManagement.getMaxAge().getName());
        System.out.println("Max age is "+employeeManagement.getMinAge().getName());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập ID muốn tìm kiếm :");
        String id = scanner.nextLine().toUpperCase();
        System.out.println(employeeManagement.getEmployeeById(id));

    }
}
