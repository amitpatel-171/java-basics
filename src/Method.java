public class Method {

    //methods/functions in java
    public static void printJava(){
        System.out.println("hello java");
    }

    public static void sum(int a, int b){
        System.out.println(a+b);
    }
    public static void printName( String name){
        System.out.println(name);
    }

    public static void main(String[] args){
        printJava();
        printName("Amit");
        sum(5,7);
    }
}
