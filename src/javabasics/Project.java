package javabasics;

import java.util.Scanner;

public class Project {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        int myNum= (int)(java.lang.Math.random()*100);
        int userNumber=0;

        do{
            System.out.println("Guess the number generated:");
            userNumber= sc.nextInt();

            if(userNumber== myNum){
                System.out.println("correct");
                break;
            }
            else if( userNumber>myNum){
                System.out.println("your entered number is too large");
            }
            else  {
                System.out.println("your entered number is too small");
            }
        }
        while (userNumber>=0);

        System.out.println("My number was:" + myNum);

    }
}
