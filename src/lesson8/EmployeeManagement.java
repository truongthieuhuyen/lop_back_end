package lesson8;

import java.util.Random;

public class EmployeeManagement {
    private int totalEmployee;
    private Employee[] employees;

    public EmployeeManagement(int totalEmployee, Employee[] employees) {
        this.totalEmployee = totalEmployee;
        this.employees = employees;
    }

    public EmployeeManagement(){
        Random random =  new Random();
        int totalEmployee = 10;
        employees = new Employee[10];

        for (int i = 0; i<totalEmployee;i++){
            String name = "Employee_"+i;
            int age = 18 + random.nextInt(47);
            String identificationNumber = "ID_"+i;
            boolean isFullTime = random.nextBoolean();
            long baserSalary = random.nextInt(200000);
            long dailySalary = random.nextInt(500000);
            if (isFullTime){
                int totalWorkingDays = random.nextInt(30);

                Employee fulltimeEmployee = new FullTimeEmployee(name,age,identificationNumber,true,totalWorkingDays,dailySalary);
                employees[i] = fulltimeEmployee;
            }
            else {
                int totalWorkingShift = random.nextInt(90);

                Employee parttimeEmployee = new ParttimeEmployee(name,age,identificationNumber,0,totalWorkingShift,baserSalary);
                employees[i] = parttimeEmployee;
            }
        }
    }

    //- Tìm nhân viên có tiền lương cao nhất/thấp nhất.
    public Employee getMaxMinSalary(){
        Employee result = employees[0];
        for (int i=0; i<employees.length; i++) {
            if (employees[i].caculateSalary()>= result.caculateSalary()){
                result = employees[i];
            }
        }
        return result;
    }

    //in thông tin
    public void printAll(){
        for (Employee employee : employees){
            System.out.println(employee.toString()+" __Salary : "+employee.caculateSalary());
        }
    }
}
