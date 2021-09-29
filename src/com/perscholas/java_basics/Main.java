package com.perscholas.java_basics;

import java.util.Scanner;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
	/*
	Write a program that declares 1 integer variable x, and then assigns 7 to it.
	Write an if statement to print out “Less than 10” if x is less than 10.
	Change x to equal 15 and notice the result (console should not display anything).
    */
        int x = 7;
        if(x < 10) {
            out.println("Less than 10");
        }
        int y = 15;
        if(y < 10) {
            out.println("Less than 10");
        }

    /*
    Write a program that declares 1 integer variable x, and then assigns 7 to it.
    Write an if-else statement that prints out “Less than 10” if x is less than 10
    and “Greater than 10” if x is greater than 10. Change x to 15 and notice the result.
    */
        int q = 7;
        if(q < 10) {
            out.println("Less than ten");
        } else {
            out.println("Greater than ten");
        }
        int w = 15;
        if(w < 10) {
            out.println("Less than ten");
        } else {
            out.println("Greater than ten");
        }

    /*
    Write a program that declares 1 integer variable x, and then assigns 15 to it.
    Write an “if-else-if” statement that prints out “Less than 10” if x is less than 10,
    “Between 10 and 20” if x is greater than 10 but less than 20, and “Greater than or equal
    to 20” if x is greater than or equal to 20. Change x to 50 and notice the result.
    */
        int e = 15;
        if(e < 10) {
            out.println("Less than 10");
        } else if(e > 10 && e < 20) {
            out.println("Between 10 & 20");
        } else if (e > 20){
            out.println("Greater than 20");
        }
        int r = 50;
        if(r < 10) {
            out.println("Less than 10");
        } else if(r > 10 && r < 20) {
            out.println("Between 10 & 20");
        } else if (r > 20){
            out.println("Greater than 20");
        }

    /*
    Write a program that declares 1 integer variable x, and then assigns 15 to it.
    Write an if-else statement that prints “Out of range” if the number is less than 10
    or greater than 20 and prints “In range” if between 10 and 20 (including equal to 10 or 20).
    Change x to 5 and notice the result
    */
        int t = 15;
        if(t < 10 || t > 20) {
            out.println("Out of Range");
        } else {
            out.println("In Range");
        }
        int u = 5;
        if(u < 10 || u > 20) {
            out.println("Out of Range");
        } else {
            out.println("In Range");
        }

    /*
    Write a program that uses if-else-if statements to print out
    grades A, B, C, D, F according to the following criteria:
    A: 90-100 B: 80-89 C: 70-79 D: 60-69 F: <60
    Use the Scanner class to accept a number score from the user
    to determine the letter grade. Print out “Score out of range.”
    if the score is less than 0 or greater than 100.
    */
        Scanner input = new Scanner(in);
        out.println("Enter Grade:");
        int grade = input.nextInt();
        if(grade >= 90 && grade <= 100){
            out.println("A");
        } else if(grade >= 80 && grade <= 89){
            out.println("B");
        } else if(grade >= 70 && grade <= 79){
            out.println("C");
        } else if(grade >= 60 && grade <= 69){
            out.println("D");
        } else if(grade < 60){
            out.println("F");
        }

    /*
    Write a program that accepts an integer between 1 and 7 from the user.
    Use a switch statement to print out the corresponding weekday.
    Print “Out of range” if the number is less than 1 or greater than 7.
    Don’t forget to include “break” statements in each of your cases.
    */
        System.out.println("Enter a number between 1 and 7: ");
        int number = input.nextInt();
        if(number >= 1 && number <= 7){
            switch (number){
                case 1 : System.out.println("Monday");break;
                case 2 : System.out.println("Tuesday");break;
                case 3 : System.out.println("Wednesday");break;
                case 4 : System.out.println("Thursday");break;
                case 5: System.out.println("Friday");break;
                case 6 : System.out.println("Saturday");break;
                case 7 : System.out.println("Sunday");break;
                default : System.out.println("Today"); break;
            }
        } else {
            out.println("Out of Range");
        }

    }//end main
}//end class
