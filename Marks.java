class Student{
    int marks[]={20,30,40,60};
    String student[]={"maha","madhavi","neha","lohi"};
    String name;
    int age,sum,avg;
    void method(){
        for(int mark:marks){
            sum+=mark;
        }
        avg=sum/marks.length;
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Sum of Marks:"+sum);
        System.out.println("Average:"+avg);
    }
    void method1(){
        for(String stud:student){
            System.out.println("Student:"+stud);

        }
    }
}
public class Marks {
    public static void main(String[]args){
        Student s=new Student();
        s.method1();        
    }
}
