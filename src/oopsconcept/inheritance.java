package oopsconcept;

public class inheritance {
    public static void main(String[]args){

        //inheritance: to pass from one generation to another

        EquilateralTriangle t1= new EquilateralTriangle();
        t1.color="red";
        //color is not defined in class triangle but it still takes it as it extends the color property from shape
    }
}

class Shape{
    String color;
}

//extends the properties of shape even when it is not declared inside the triangle class
//single level
class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
}

//multi-level
class EquilateralTriangle extends Shape{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
}

//hierarcial
class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}

// types of inheritance
//single level
//multi-level
//hierarcial
//hybrid

