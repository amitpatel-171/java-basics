package oopsconcept;

public class polymorphismm {

    //when a specific task is performed a number of times using different methods
    // 2 types function overlaoding(compiletime) and function overriding(runtime)
    //function overlaoding- same name but performs different functions

    public static void main(String [] args){
        Students s1= new Students();
        s1.name= "amit";
        s1.age= 23;

        s1.printInfo(s1.name);

    }
}

class Students{
    String name;
    int age;

    //rules to follow in overlaoding
    // either they should have a different return type or type of parameters should be different i,e string, int ,bool etc, or they should have different number of arguments
    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name, int age){
        System.out.println(name+" "+age);
    }
}
