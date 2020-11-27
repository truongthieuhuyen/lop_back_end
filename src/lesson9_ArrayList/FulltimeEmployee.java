package lesson9_ArrayList;

public class FulltimeEmployee extends Employee {
    private static final int MEAL_ALLOWANCE = 2000000;

    private int totalWorkingDays;
    private float dailySalary;

    /**
     *
     * @param name
     * @param age
     * @param identificationNumber
     * @param totalWorkingDays
     * @param dailySalary
     */
    public FulltimeEmployee(String name, int age, String identificationNumber,boolean isFulltime, int totalWorkingDays, float dailySalary) {
        super(name, age, identificationNumber,isFulltime);
        this.totalWorkingDays = totalWorkingDays;
        this.dailySalary = dailySalary;
    }

    @Override
    public long getMEAL_ALLOWANCE() {
        return MEAL_ALLOWANCE;
    }

    @Override
    public float getSalaryRate() {
        return dailySalary;
    }

    @Override
    public int getWorkingCount() {
        return totalWorkingDays;
    }

    public float calculateSalary(){

        return calculateSalary();
    }

    @Override
    public String toString() {
        return "FulltimeEmployee{" +
                " '" + name + '\'' +
                ", age=" + age +
                ", identificationNumber='" + identificationNumber + '\'' +
                ", totalWorkingDays=" + totalWorkingDays +
                ", dailySalary=" + dailySalary +
                '}';
    }
}
