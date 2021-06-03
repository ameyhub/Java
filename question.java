/*
    created by : amey didolkar
 */

/*
Write a program to calculate cgpa of 5 subject and print the output weather student
pass exam or fail
 */
package com.company;
import java.util.*;
public class question {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        // personal details
        System.out.println("What is your name");
        String name = s.nextLine();
        System.out.println("Which standard you are (example 1,2,3,4)");
        int st = s.nextInt();
        System.out.println("What is your Roll NO");
        int roll = s.nextInt();


        // Subject details
        System.out.println("Enter English Subject Marks");
        int eng = s.nextInt();
        System.out.println("Enter Maths Subject Marks");
        int mat = s.nextInt();
        System.out.println("Enter Hindi Subject Marks");
        int hindi = s.nextInt();
        System.out.println("Enter Social Science Subject Marks");
        int so = s.nextInt();
        System.out.println("Enter Science Subject Marks");
        int sci = s.nextInt();


        // Total marks
        float total = eng+mat+hindi+so+sci;
        System.out.println("Total of your marks = " +total);


        // average of all
        float cgpa;
        cgpa = total/5;
        System.out.println("You CGPA is = " +cgpa);


        //Failed Subject
        if(eng < 45){
            System.out.println("Failed in ENGLISH");
        }
        if (mat < 45){
            System.out.println("You FAIL in MATHS");
        }
        if (hindi < 45){
            System.out.println("You FAIL in HINDI");
        }
        if (so < 45){
            System.out.println("You FAIL in SOCIAL SCIENCE");
        }
        if (sci < 45){
            System.out.println("You FAIL in SCIENCE");
        }


        //Passing Criteria
        if(cgpa > 80) {
            System.out.println("You PASS in exam -- Congulatulation --");
            System.out.println("You Pass in exam with First Division with Honours");
        }
        else if (cgpa >= 75){
            System.out.println("You PASS in exam -- Congulatulation --");
            System.out.println("You Pass in exam with First Division");
        }
        else if (cgpa >= 60){
            System.out.println("You PASS in exam -- Congulatulation --");
            System.out.println("You Pass in exam with First Class");
        }
        else if (cgpa >= 50){
            System.out.println("You PASS in exam");
            System.out.println("You Pass in exam with Secound Class");
        }
        else if (cgpa > 40){
            System.out.println("You FAIL in exam");
        }




    }
}
