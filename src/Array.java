import java.util.*;

public class Array {
    public static void main( String[] args){
        //to store list of data like marks of student, salary of employees
        int [] marks= new int[3];

        marks[0]= 97;
        marks[1]=99;
        marks[2]= 85;
//        System.out.println(marks[2]);// prints marks present on index 2
        //another way to define array
        int[] salaray= {47000,58000};
        System.out.println(salaray[0]);
        // when something is initialised like name, age , etc and no value is provided it stores null value inside it
        //it also has a length as a function in order to identify the length of the array

        //sort
        System.out.println(marks[0]);
         Arrays.sort(marks);
        System.out.println(marks[0]);


        //2d array
        int [][] finalMarks= {{98,95,97},{88,96,97}};
        System.out.println( "marks of student using 2d array: "+ finalMarks[0][2]); //it prints the marks of student 1 at index 2 i.e. 97
        System.out.println( "marks of student using 2d array: "+ finalMarks[1][0]);
    }
}
