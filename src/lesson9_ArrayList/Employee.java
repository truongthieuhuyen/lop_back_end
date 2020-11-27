package lesson9_ArrayList;

public abstract class Employee {
    protected String name;
    protected Integer age;
    protected String identificationNumber;
    protected boolean isFulltime;

    public abstract long getMEAL_ALLOWANCE();
    public abstract float getSalaryRate();
    public abstract int getWorkingCount();


    public float calculateSalary() {
        float calculateSalary = getSalaryRate() * getWorkingCount() + getMEAL_ALLOWANCE();
        return calculateSalary;
    }

    /**
     *
     * @param name
     * @param age
     * @param identificationNumber
     */
    public Employee(String name, int age, String identificationNumber, boolean isFulltime) {
        this.name = name;
        this.age = age;
        this.identificationNumber = identificationNumber;
        this.isFulltime = isFulltime();
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

    public boolean isFulltime() {
        return isFulltime;
    }

    public void setFulltime(boolean fulltime) {
        isFulltime = fulltime;
    }
}
