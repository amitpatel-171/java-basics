public class Operators {
    public static void main(String [] args){
        //operators
        // arithmetic operators - they include add, substract, divide, multiply

        int a=3;
        int b=4;
        int add= a+b;
        int diff= a-b;
        int divide= a/b;
        //if we want decimal values we can use double instead of int
        double c=9;
        double d=11;
        double div= c/d;
        int multipy= a*b;
        System.out.println("add: " +add);
        System.out.println("diff: "+diff);
        System.out.println("normal divide: "+divide);
        System.out.println("multipy: "+multipy);
        System.out.println("divide using double: "+div);

        //modulo when we want remainder
        int x=5;
        int y=3;
        int mod= x%y;
        System.out.println("modulo: "+mod);

        // assignment operators =, ++, --(these are called unary operations)
        int count = 1;
        System.out.println("count is: "+count);
        count++;
        System.out.println("updated count is: "+count);

        //other operators include ==,!=, <, >, <=,>=, &&, ||(or operator)
    }
}
