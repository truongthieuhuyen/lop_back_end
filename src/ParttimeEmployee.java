package lesson9_ArrayList;

public class ParttimeEmployee extends Employee {
    public static final int MEAL_ALLLOWANCE = 0;

    private int totalWorkingShift;
    private float baseSalary;

    /**
     *
     * @param name
     * @param age
     * @param identificationNumber
     * @param totalWorkingShift
     * @param baseSalary
     */
    public ParttimeEmployee(String name, int age, String identificationNumber, boolean isFulltime, int totalWorkingShift, float baseSalary) {
        super(name, age, identificationNumber, isFulltime);
        this.totalWorkingShift = totalWorkingShift;
        this.baseSalary = baseSalary;
    }

    @Override
    public long getMEAL_ALLOWANCE() {
        return 0;
    }

    @Override
    public float getSalaryRate() {
        return 0;
    }

    @Override
    public int getWorkingCount() {
        return 0;
    }

    @Override
    public String toString() {
        return "ParttimeEmployee{" +
                " '" + name + '\'' +
                ", age=" + age +
                ", identificationNumber='" + identificationNumber + '\'' +
                ", totalWorkingShift=" + totalWorkingShift +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
