package lesson6._62;

public class Student {

    private String name;
    private float gpa;

    //Constructor
    public Student(String name, float gpa) {
        this.name = name;
        this.gpa = gpa;//điểm trung bình
    }

    //getter & setter
    public void setName(String name) {
        this.name = name;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public float getGpa() {
        return gpa;
    }

    // check Pass
    public boolean checkPass(){
        if (gpa>=1.5){
            return true;
        }else {
            return false;
        }
    }


    public void inGpa() {
        System.out.println("GPA:" + gpa);
    }

    public void inName() {
        System.out.println("Name:" + name);
    }

    public void printName_Gpa(){
        System.out.println(name+ " "+ gpa);
    }

//    public static void main(String[] args) {
//        Student student = new Student("an",1.5f);
//        student.checkPass();
//    }
}
