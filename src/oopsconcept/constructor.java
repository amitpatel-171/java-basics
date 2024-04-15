package oopsconcept;

// this is important to understand oops concept in java
public class constructor {

    public static void main(String[] args){
        //we will to declare name and age of student here when using parameterised constructor
        Student s1= new Student("amit", 23);
        s1.printInfo();
    }
}

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(name);
        System.out.println(age);
    }
    //Student() is a constructor, they are used to create objects in java
    //they do not have a return type
    //can be called only once when an object is created

//    Student(){
//        System.out.println("constructor called");
//    }


    //initialization in constructor
    Student(String name, int age){
        this.name= name; // here this.name is objects name and 'name' is our constructors name
        this.age= age;
    }

}

//in java we do not need to write destructors becuase it makes use of garbage collectors

