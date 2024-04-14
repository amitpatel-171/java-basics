//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Namaste");


        //variables
        //data which we want to store in our memory for temporary peroid are stored in the form
        //varables eg name, integer, etc.
        String name= "Amit";
        int age= 25;
        String surName= "Patel";
        String fullName= name+surName;
        System.out.println(fullName);

        //data types
        /* they are of 2 main types primitive and non-primitive
        * primitive: byte- [-128 to128]
        * int- 4
        * short-2
        * long 8
        * float- 4
        * double- 8 3.14
        * char-2 a,b,c,d
        * boolean- 1 true/false
        * */
        byte age1=30;
        int num= 1234567890;
        long num2= 12345678900L; //helps java understand that instead of int we are storing a long
        float pi= 3.14F; //helps identify it as float
        char letter= 'a'; // use '' commas only
        boolean isOn= true;


        /* non-primitive datatypes size is not fixed
        *  string
        * arrays*/
        String name1= "Amit";
        System.out.println(name1.length());// helps print length of name

    }
}