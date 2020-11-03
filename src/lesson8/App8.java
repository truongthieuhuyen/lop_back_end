package lesson8;

public class App8 {
    public static void main(String[] args) {
        EmployeeManagement employeeManagement = new EmployeeManagement();
        employeeManagement.printAll();
        System.out.println();
        System.out.println("max salary is "+employeeManagement.getMaxMinSalary().getName()+" : "+employeeManagement.getMaxMinSalary().caculateSalary());
    }
}
