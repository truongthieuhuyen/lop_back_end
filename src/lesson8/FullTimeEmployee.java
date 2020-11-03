package lesson8;

public class FullTimeEmployee extends Employee {
    public static final int MEAL_ALLOWANCE = 2000000;//nhân viên fulltime sẽ đc trợ cấp 2tr tiền ăn
    private int totalWorkingDays;
    private long dailySalary;

    public FullTimeEmployee(String name, int age, String identificationNumber, boolean isFullTime, int totalWorkingDays, long dailySalary) {
        super(name, age, identificationNumber, isFullTime);
        this.totalWorkingDays = totalWorkingDays;
        this.dailySalary = dailySalary;
    }

    @Override
    public long getMealAllowance() {
        return MEAL_ALLOWANCE;
    }

    @Override
    public long getSalaryRate() {
        return dailySalary;
    }

    @Override
    public int getWorkingCount() {
        return totalWorkingDays;
    }

    @Override
    public long caculateSalary() {
        long caculateSalary = getWorkingCount() * getSalaryRate() + getMealAllowance();
        return caculateSalary;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                " " + name + '\'' +
                ", age=" + age +
                ", ID='" + identificationNumber + '\'' +
                ", isFullTime=" + isFullTime +
                ", totalWorkingDays=" + totalWorkingDays +
                ", dailySalary=" + dailySalary +
                '}';
    }
}
