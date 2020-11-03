package lesson8;

public class ParttimeEmployee extends Employee {
    int MEAL_ALLOWANCE = 0;

    private int totalWorkingShift;
    private long baseSalary;

    public ParttimeEmployee(String name, int age, String identificationNumber, int MEAL_ALLOWANCE, int totalWorkingShift, long baseSalary) {
        super(name, age, identificationNumber);
        this.MEAL_ALLOWANCE = MEAL_ALLOWANCE;
        this.totalWorkingShift = totalWorkingShift;
        this.baseSalary = baseSalary;
    }

    @Override
    public long getMealAllowance() {
        return MEAL_ALLOWANCE;
    }

    @Override
    public long getSalaryRate() {
        return baseSalary;
    }

    @Override
    public int getWorkingCount() {
        return totalWorkingShift;
    }

    @Override
    public long caculateSalary() {
        long caculateSalary = getSalaryRate() * getWorkingCount() +getMealAllowance();
        return caculateSalary;
    }

    @Override
    public String toString() {
        return "ParttimeEmployee{" +
                " " + name + '\'' +
                ", age=" + age +
                ", ID='" + identificationNumber + '\'' +
                ", isFullTime=" + isFullTime +
                ", totalWorkingShift=" + totalWorkingShift +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
