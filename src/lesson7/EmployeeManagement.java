package lesson7;

import java.util.Random;

public class EmployeeManagement {
    private Employee[] employees;

    public EmployeeManagement(){
        Random random = new Random();
        employees= new Employee[10];
        for (int i=0;i< employees.length;i++){
            String name ="Employee_"+i;
            int age = 18 + random.nextInt(47);
            String address ="Street_"+i;
            boolean isFullTime = random.nextBoolean();

            if (isFullTime){
                float baseSalary = random.nextFloat();
                boolean isBoss = random.nextBoolean();
                int overTimeDay = random.nextInt(31);

                Employee fulltimeEmployee =new FullTimeEmployee(name,age,address,isFullTime,baseSalary,overTimeDay,isBoss);
                employees[i] = fulltimeEmployee;
            }else {
                int workHourNumber = 8 * random.nextInt(26);

                Employee parttimeEmployee = new PartTimeEmployee(name,age,address,isFullTime,workHourNumber);
                employees[i] = parttimeEmployee;
            }
        }
    }

    public void printAllEmployee(){
        for (Employee employee :employees){
            System.out.println(employee.toString());
        }
    }
    /**
     *
     */
    public EmployeeManagement(Employee[] employees) {
        this.employees = employees;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }
}
