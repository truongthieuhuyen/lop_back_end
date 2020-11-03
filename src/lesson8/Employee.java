package lesson8;

public abstract class Employee {
    protected String name;
    protected int age;
    protected String identificationNumber;
    protected boolean isFullTime;

    public Employee(String name, int age, String identificationNumber, boolean isFullTime) {
        this.name = name;
        this.age = age;
        this.identificationNumber = identificationNumber;
        this.isFullTime = isFullTime;
    }

    public Employee(boolean isFullTime) {
        this.isFullTime = isFullTime;
    }

    public Employee(String name, int age, String identificationNumber) {
        this.name = name;
        this.age = age;
        this.identificationNumber = identificationNumber;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(String identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public void setFullTime(boolean fullTime) {
        isFullTime = fullTime;
    }

    //Phương thức trừu tượng getMealAllowance() sau này sẽ trả về số tiền (kiểu long) trợ cấp ăn trưa
    public abstract long getMealAllowance();

    //Phương thức trừu tượng getSalaryRate() sau này sẽ trả về số tiền lương theo ngày đối với nhân viên fulltime
    // hoặc ca làm việc đối với nhân viên parttime.
    public abstract long getSalaryRate();

    // Phương thức trừu tượng getWorkingCount() sau này sẽ trả về tổng số ngày làm việc đối với nhân viên fulltime
    // hoặc tổng số ca làm việc đối với nhân viên parttime
    public abstract int getWorkingCount();

    //Phương thức calculateSalary() để tính lương cho nhân viên theo công thức:
    // lương nhận đc = số ngày (ca) làm việc x lương ngày (ca) + trợ cấp ăn
    public abstract long caculateSalary();

}
