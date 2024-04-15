package javabasics;

public class strings {
    public static void main(String[] args){
        //javabasics.strings are immutable in nature i.e. cannot be changes
        //we can perform various functions on string some are listed below
        //concatenate i.e. to add 2 different Strings

        String firstName= "Amit";
        String lastName= "Patel";
        String fullName= firstName+ lastName;
        System.out.println(fullName);

        //charAt: to check the position of a character present at a specific position
        System.out.println(firstName.charAt(3));

        //length: know the length of the string
        System.out.println(lastName.length());

        //replace: to replace a character
        String namee= lastName.replace('e', 'i' );
        System.out.println(namee);
        //does not replace the value in the original string but does in th new one that is created

        //substring; a small part of the string eg amit patel its substring would be amit/ patel
        System.out.println(fullName.substring(2,4)); //it takes the position of the values that we want to print


    }
}
