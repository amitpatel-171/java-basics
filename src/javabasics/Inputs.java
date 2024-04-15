package javabasics;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("input your age: ");
        int age= sc.nextInt();
        System.out.println(age);
//        Scanner sc = new Scanner(System.in);

        System.out.println("input your  name: ");
        String name= sc.next(); //used for taking single words a s input
        System.out.println(name);
        sc.nextLine();
        //for complete sentence we use nextLine
        System.out.println("input your sentence: ");
        String lines= sc.nextLine();
        System.out.println(lines);
    }
}
