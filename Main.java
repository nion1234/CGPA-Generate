package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int marks;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your marks:");
        marks=input.nextInt();
        if(marks<50) {
            System.out.println("You Failed.");
        }
            else if(marks>50 && marks<=59) {
            System.out.println("Your Grade is D.");
        }
                else if(marks>=60 && marks<=64) {
            System.out.println("Your Grade is D+.");
        }
                    else if(marks>=65 && marks<=69){
                        System.out.println("Your Grade is C.");
                    }
                    else if(marks>=70 && marks<=74){
                        System.out.println("Your Grade is C+");

        }
                    else if(marks>=75 && marks<=79){
                        System.out.println("your Grade is B");

        }
                    else if(marks>=80 && marks<=84){
                        System.out.println("Your Grade is B+");

        }
                    else if(marks>=85 && marks<=89){
                        System.out.println("Your Grade is A.");

        }
                    else if(marks>=90 && marks <=100){
                        System.out.println("Your Grade id A+");
        }
                    else
        {
            System.out.println("Invalid Input!!please Enter Your correct marks.");
        }
                }
            }


