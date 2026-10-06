class Animal {
    int age;
    int height;
    Animal(int age, int height) {
        this.age = age;
        this.height = height;
    }
}
public class Mamel{
    public static void main(String[]args){
        Animal a=new Animal(20,10);
        System.out.println("Age of the Animal:"+a.age);
        System.out.println("Height of the Animal:"+a.height);
    }
}