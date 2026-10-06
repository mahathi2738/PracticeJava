class Stude{
    String name;
    int age;
    int marks;
    Stude(String name,int age,int marks){
        this.name=name;
        this.age=age;
        this.marks=marks;
    }
     void method(){
        if(marks>80){
            System.out.println("Passed");
        }
    }
}
public class Student {
    public static void main(String[]args){
        Stude s=new Stude("Mahathi",19,90);
        s.method();
    }
}
