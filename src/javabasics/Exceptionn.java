package javabasics;

import java.util.Arrays;

public class Exceptionn {
    public static void main(String[] args){
        int [] marks= {55,88,96};
        try{
            System.out.println(marks[12]);
        } catch (Exception exception){
            System.out.println("Please fix the error it is out of index");
        }

        Arrays.sort(marks);
        System.out.println(marks[0]);
    }
}
