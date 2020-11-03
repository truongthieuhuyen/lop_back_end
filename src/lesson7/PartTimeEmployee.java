package lesson7;

public class PartTimeEmployee extends Employee{

    private int workHourNumber;

    //caculateSalaryThisMonth
    public float caculateSalaryThisMonth(){
        float result = 0;
        result = workHourNumber*0.1f;
        return result;
    }


    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", isFullTime=" + isFullTime +
                ", workHourNumber=" + workHourNumber +
                ", SalaryThisMonth=" + caculateSalaryThisMonth()+
                '}';
    }

    /**
     *
     * @param name
     * @param age
     * @param address
     * @param isFullTime
     * @param workHourNumber
     */
    public PartTimeEmployee(String name, int age, String address, boolean isFullTime, int workHourNumber) {
        super(name, age, address, isFullTime);
        this.workHourNumber = workHourNumber;
    }

    public int getWorkHourNumber() {
        return workHourNumber;
    }

    public void setWorkHourNumber(int workHourNumber) {
        this.workHourNumber = workHourNumber;
    }
}
