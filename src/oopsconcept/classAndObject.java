package oopsconcept;

// this is important to understand oops concept in java
public class classAndObject {
    public static void main(String[] args){
        /* class and objects
        objects can be any entity like person, animalm etc
        and the properties/actions of those objects are written inside class
        every object has it properties methods.
        * */
        //objects
        Pen pen1 = new Pen();
        pen1.color="blue";
        pen1.type="gel";

        Pen pen2 = new Pen();

        pen2.color="black";
        pen2.type="ballpoint";

        pen1.printColor(); //it calls the printColor function from the pen class
        pen2.printColor();


    }
}

class Pen{
    String color;
    String type;
    //function declared inside a class is called a method
    public void write(){
        System.out.println("writing something");
    }

    public void printColor(){
        System.out.println(this.color); //this keyword is used to access a object

    }
}
