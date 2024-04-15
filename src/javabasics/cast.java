package javabasics;

public class cast {
    public static void main(String[] args){
        //casting: converting from one type to another i.e. int to double or vice versa
        //2 types implicit and explicit
        //this is an example of implicit casting
        double price =100;
        double finalPrice= price+ 18; //here we do not need to typecast as java automatically does it for us
        //because double stores more data than an integer.
        System.out.println(finalPrice);

        //this is an example of explicit casting
        int price1= 100;
        int finalPrice1= price1+(int)18.0;
        System.out.println(finalPrice1);


        //constants
        final float PI= 3.14F;// final keyword disables user to change the value of pi in future
        System.out.println(PI);
    }
}
