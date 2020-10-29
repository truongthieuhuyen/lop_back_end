package lesson6._62;

import java.util.Scanner;

/*- Các phương thức:
    + Nhập vào thông tin từng sinh viên khi khởi tạo lớp.
    + Đếm tổng số sinh viên đỗ.
    + Đếm tổng số sinh viên trượt.
    + Tìm sinh viên có điểm gpa cao nhất.
    + Tìm sinh viên có điểm gpa thấp nhất.

 */
public class StudentManagement {
    private int totalStudent;//tổng số sv
    private Student[] students;

    public StudentManagement(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("input totalStudent :");
        int totalStudent =scanner.nextInt();

        students =new Student[totalStudent];

        for (int i=0;i<students.length;i++){
            System.out.print("Name["+i+"] :");
            String name=scanner.next();
            System.out.print("GPA["+i+"] :");
            float gpa=scanner.nextFloat();
            System.out.println("-------------");

            students[i]=new Student(name,gpa);
        }
        System.out.println();
    }

    public int countPass(){
        int count =0;
        for (Student student:students){
            if (student.checkPass()){
                count++;
            }
        }
        System.out.print("number of students has passed :");
        return count;
    }

    public int countFail(){
        int count=0;
        for (Student student:students){
            if (!student.checkPass()){
                count++;
            }
        }
        System.out.print("number of students has failed :");
        return count;
    }

    public float getMaxGpa(){
        float max = students[0].getGpa();
        for(int i=0;i<students.length;i++) {
            if (students[i].getGpa() > max) {
                max = students[i].getGpa();
                System.out.println(students[i].getName()+" is the highest GPA student");
            }
        }
        return max;
    }

    public float getMinGpa(){
        float min = students[0].getGpa();
        for(int i=0;i<students.length;i++){
            if (students[i].getGpa()<min){
                min = students[i].getGpa();
                System.out.println(students[i].getName()+" is the lowest GPA student");
            }
        }return min;
    }

    public static void main(String[] args) {
        StudentManagement studentManagement = new StudentManagement();
        System.out.println(studentManagement.countPass());
        System.out.println(studentManagement.countFail());
        System.out.println(studentManagement.getMaxGpa());
        System.out.println(studentManagement.getMinGpa());

    }
}
