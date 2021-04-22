package com.theshubhamgour;

import org.w3c.dom.ls.LSOutput;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello World");

        /*
         What are Variables??
         Water - Bucket
         Masala - Box
         Lunch - LunchBox

         In Java:
          Variables are containers which store data values such as:
          String, int, float, char, boolean

          How to declare variables??

          Syntax:
          <datatype> <variable name> = <value>;
          #remember the semicolon (;) is important after almost every statement in java
        */

        //Now Let's make use of variables
        String name = "Shubham";
        System.out.println(name);

        int a = 45;
        // this will assign 45 to integer variable a

        float b = 46.52f;
        // #Remember when ever you assign a vlaue to flaot variable wirte f at the ending for no error during compilation
        // this will assign 46.52 to float variable b

        boolean animelover = true;
        /* 1. Don't wirte t in capital
           2. Don't use " " while assigning values for a boolean variable
        */

        // now let's print the output of the assigned values
        System.out.println(a);
        System.out.println(b);
        System.out.println(animelover);


        /*
         Rules for constructing variables name in java:
         1. Can contain digits, letters, dollar signs, undercores.
         2. Should begin with a letter or $ or underscore(_).
         3. Java is case sensitive which means shubham and Shubham are two different varibales.
         4. Should not contain whitespaces
         5. You cannot use reserved words in java like system, main etc.
         */

        // Datatypes in Java

        /*
         There are two datatypes in java:

         1. Primitive: byte (1 byte), char(2 byte), int(4 byte), long(8 byte), double(8 byte), float(4 byte),
          boolean(1 bit), short(2 bytes)

         2. Non-Primitive or Reference Data types:  Collection of similar datatypes eg: Array.
         */

        byte e = 88;
        System.out.println(e);

        double q = 56.2253654;
        System.out.println(q);

        char grade = 'A';
        System.out.println(grade);

        /*
         Operators in Java

         Operand, operator, operand     =   Result
         5          +           8       =   13

        */



        /*

         //Types of operator in java
         There are four types of operators in java:

         1. Arithmetic operators
         2. Assignment operators
         3. Logical operators
         4. Comparision Operators

         */


        int num1 = 45;
        int num2 = 59;

        //Now let's add two numbers
        System.out.print("Addition of two numbers are :");
        System.out.println(num1 + num2);

        //Now let's subtract two numbers
        System.out.print("Addition of two numbers are :");
        System.out.println(num1 - num2);

        //Now let's multiply two numbers
        System.out.print("Addition of two numbers are :");
        System.out.println(num1 * num2);

        //Now let's divide two numbers
        System.out.print("Addition of two numbers are :");
        System.out.println(num1 / num2);

        //Now let's take mod (%) of two numbers
        System.out.print("Addition of two numbers are :");
        System.out.println(num1 % num2);

        //Now let's see the concept of increment and decrement operators nad thier types

        // Post increment
        System.out.println(num1++);
        //45 then plus 1

        // Pre increment
        System.out.println(++num1);
        // now it is 46 and before printing +1

        // Post decrement
        System.out.println(num1--);
        // now 47 and after printing -1

        // Pre increment
        System.out.println(--num1);
        // now before printing 46 -1


        /*
         Comparision Operators:
         1. == : Checks for equality of two values.
         2. != : Checks if two values are not equal.
         3. <  : Checks if number is smaller.
         4. >  : Checks if number is greater.
         5. <= : Checks if number is smaller than or equals to another value.
         6. >=  : Checks if number is greater than or equals to another value.
         */


        /*
          Logical Operators:
          1. && - Logical and operator - returns true if both conditions are true.
          2. || - Logical or operator  - returns true if any one condition is true.
          3. !  - Logical not operator - reverses the result: if true then false.
         */


        // Taking user input in Java.

        Scanner scan = new Scanner(System.in);
        //we use (System.in) here because we want user to enter data through keyboard

        System.out.println("Enter a number: ");
        String input = scan.nextLine();
        System.out.println(input);


        //Now we will make use of concatenation property
        String id = "Shubham";
        String channel = "theshubhamgour";
        System.out.println(id.length());
        System.out.println(id + "Insta i'd " + channel);
        System.out.println(id.toLowerCase());
        System.out.println(id.toUpperCase());


        // Escape Sequence character (\): we use these to print the character's which we find difficult to print such as (")
        System.out.println(id + "from\" " + channel);
        System.out.println(id + "from\\ " + channel);
        System.out.println(id + "from\t " + channel);
        System.out.println(id + "from\n " + channel);


        System.out.println(id.contains("Shu"));
        System.out.println(id.charAt(2));
        System.out.println(id.endsWith("am"));

        // indexing starts from zero remember
        System.out.println(id.indexOf("bh"));


        /***********************************************************************************/


        // The use of Math method
        int numb1 = 5, numb2 = 7;
        System.out.println(Math.max(numb1, numb2));
        System.out.println(Math.min(numb1, numb2));
        System.out.println(Math.sqrt(81));

        // Math.abs make a negative number positive and a positive number as it is
        System.out.println(Math.abs(-96));
        System.out.println(Math.abs(6));

        // it will give any random number between 0 and 1
        System.out.println(Math.random());

        //it will give a random number from 4 and 8
        System.out.println(4 + (8 - 4) * Math.random());
        System.out.println(1 + (6 - 1) * Math.random());


        /****************************************************************************/
        // If-else conditions
        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        if (age > 5) {

            System.out.println("You are not a kid");
        } else {
            System.out.println("You are a kid");
        }

        /*****************************************************************************/

        // you can also make use of this in this way
        if (age > 20) {

            System.out.println("You are not a kid");
        }


        /**************************************************************/

        // Switch statemnt in Java

        switch (age) {
            case 12:
                System.out.println("You are 12 Years Old");
                break;
            case 56:
                System.out.println("You are 56 Years Old");
                break;
            case 98:
                System.out.println("You are 98 Years Old");
                break;
            default:
                System.out.println("You did not match any of the test case");
                break;
        }

        /*******************************************************/
        //Loops

        /*
           While loop Syntax:
              while(condition){
                  // This code will keep executing until the condition is true
           }

         */


        int i = 0;
        while (i < 100) {
            System.out.println(i);
            i += 1;
        }


        /**************************************************/



        /*
           Do While loop Syntax:
              do{
                  // This code will keep executing until the condition is true
           }while(condition)

         */

        int j = 0;
        do {
            System.out.println(j);
            j += 1;
        } while (j < 100);


        /*****************************************************/

        /*For Loop
           for(st1;st2;st3){
           //code to be executed
           }
         */


        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            continue;
        }
        else{
            System.out.println(i);
        }

        /*******************************************************/

        //Java Arrays
        int[] marks = {1, 2, 3, 4, 5};
        //for updating the third value
        marks[3] = 65;
        System.out.println(marks[0]);
        System.out.println(marks[3]);

        //Classical way to iterate an array
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        //for each loops
        for (int value : marks) {
            System.out.println(value);
        }

        int[][] matrix = {{1, 2, 3}
                {4, 5, 6}};
        System.out.println(matrix[0][1]);


        String[] cars = {"maruti", "suzuki", "Innova", "titaniium"}
        for (String value : cars) {
            System.out.println(value);
        }

        /******************************************************/

        //Try -catch

        String[] cars = {"maruti", "suzuki", "Innova", "titaniium"}
        try {
            System.out.println(cars[3]);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Moonson");
    }

















    }
}