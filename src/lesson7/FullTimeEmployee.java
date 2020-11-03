package lesson7;

public class FullTimeEmployee extends Employee {
    private float baseSalary;
    private int overTimeDay;
    private boolean isBoss;

    //caculateSalaryThisMonth
    public float caculateSalaryThisMonth(){
        float result = 0;
        if (isBoss){
            result = 20;//Salary = 20M
        }
        else {
            result = 10;//Salary =10M
        }
        result = result + overTimeDay*0.8f;
        return result;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                " name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", isFullTime=" + isFullTime +
                ", isBoss=" + isBoss +
                ", baseSalary=" + baseSalary +
                ", overTimeDay=" + overTimeDay +
                ", SalaryThisMonth=" + caculateSalaryThisMonth() +
                '}';
    }

    /**
     *
     * @param name
     * @param age
     * @param address
     * @param isFullTime
     * @param baseSalary
     * @param overTimeDay
     * @param isBoss
     */
    public FullTimeEmployee(String name, int age, String address, boolean isFullTime, float baseSalary, int overTimeDay, boolean isBoss) {
        super(name, age, address, isFullTime);
        this.baseSalary = baseSalary;
        this.overTimeDay = overTimeDay;
        this.isBoss = isBoss;
    }

    public float getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(float baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getOverTimeDay() {
        return overTimeDay;
    }

    public void setOverTimeDay(int overTimeDay) {
        this.overTimeDay = overTimeDay;
    }

    public boolean isBoss() {
        return isBoss;
    }

    public void setBoss(boolean boss) {
        isBoss = boss;
    }
}
