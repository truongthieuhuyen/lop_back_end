package lesson9_ArrayList;

import java.util.*;

/**
 * Các phương thức:
 * // Khởi tạo với đối số truyền vào là tổng số nhân viên cần quản lý n
 * // Nhập thông tin cho từng nhân viên (Khi nhập thì đưa ra lựa chọn để nhập nhân viên fulltime, parttime)
 * // Tìm nhân viên có tuổi cao nhất/thấp nhất (thử sort theo tuổi dung comparator)
 * // Tìm nhân viên theo chứng minh nhân dân (sử dụng map)
 */
public class EmployeeManagement {
    private int n;//tổng số nv
    private ArrayList<Employee> employees = new ArrayList<Employee>();
    private HashMap<String, Employee> mapEmployees = new HashMap<String, Employee>(); //map

    public EmployeeManagement() {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("input number of employees :");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("input employee's name: ");
            String name = scanner.next();
            int age = random.nextInt(47) + 18;
            String identificationNumber = "ID" + i;
            System.out.println("Is this a full-time employee: ");
            String fullOrPart = scanner.next().toUpperCase();

            boolean isFulltime;

            if (fullOrPart.equals("Y")) {
                isFulltime = true;
                System.out.println("input working days: ");
                int totalWorkingDays = scanner.nextInt();
                System.out.println("input daily salary:");
                float dailySalary = scanner.nextFloat();

                Employee fulltimeEmployee = new FulltimeEmployee(name, age, identificationNumber, true, totalWorkingDays, dailySalary);
                employees.add(fulltimeEmployee);
                mapEmployees.put(identificationNumber, fulltimeEmployee);
            } else if (fullOrPart.equals("N")) {
                isFulltime = false;
                System.out.println("input working shift: ");
                int totalWorkingShift = scanner.nextInt();
                System.out.println("input base salary: ");
                float baseSalary = scanner.nextFloat();

                Employee parttimeEmployee = new ParttimeEmployee(name, age, identificationNumber, false, totalWorkingShift, baseSalary);
                employees.add(parttimeEmployee);
                mapEmployees.put(identificationNumber, parttimeEmployee);
            } else {
                System.out.println("Bạn hãy nhập (Y) hoặc (N)");
            }
//            if (isFulltime) {
//                System.out.println("input working days: ");
//                int totalWorkingDays = scanner.nextInt();
//                System.out.println("input daily salary:");
//                long dailySalary = scanner.nextLong();
//
//                Employee fulltimeEmployee = new FulltimeEmployee(name, age, identificationNumber, true, totalWorkingDays, dailySalary);
//                employees.add(fulltimeEmployee);
//                mapEmployees.put(identificationNumber,fulltimeEmployee);
//            } else {
//                System.out.println("input working shift: ");
//                int totalWorkingShift = scanner.nextInt();
//                System.out.println("input base salary: ");
//                long baseSalary = scanner.nextLong();
//
//                Employee parttimeEmployee = new ParttimeEmployee(name, age, identificationNumber, false, totalWorkingShift, baseSalary);
//                employees.add(parttimeEmployee);
//                mapEmployees.put(identificationNumber,parttimeEmployee);
//            }
        }
    }

    public void printAll() {
        for (Employee employee : employees
        ) {
            System.out.println(employee.toString());
        }
    }

    public Employee getMaxAge() {
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                return employee1.age.compareTo(employee2.age);
            }
        });
        return employees.get(employees.size() - 1);
    }

    public Employee getMinAge() {
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                return employee1.age.compareTo(employee2.age);
            }
        });
        return employees.get(0);
    }

    /**
     *
     * @param id
     * @return
     */
    public Employee getEmployeeById(String id) {
        for (Employee employee : employees
        ) {
            if (employee.getIdentificationNumber() == id){
                return employee;
            }
        }return mapEmployees.get(id);
    }
}
