package com.company;
import java.util.Scanner;
public class Main {
    //for get sum
    public static double sum(double n,double m){
        double sum1=n + m;
        return sum1;
    }
    //for get difference
    public static double difference(double n,double m){
        double dif=n-m;
        return dif;
    }
    //for get multiplication
    public static double multiplication(double n,double m){
        double multi=n*m;
        return multi;
    }
    //for get division
    public static double division(double n,double m){
        double div=n/m;
        return div;
    }

    public static void main(String[] args) {
        int operator;
        double num1,num2,answer;
        Scanner input = new Scanner(System.in);
        //instructions
        System.out.println("Hello!");
        System.out.println("Wht do you want to do?");
        System.out.println("Press num 1 for sum");
        System.out.println("Press num 2 for difference");
        System.out.println("Press num 3 for multiplication");
        System.out.println("Press num 4 for division");

        System.out.println("Press your option..... ");
        operator= input.nextInt();

        System.out.println("Enter number 1....");
        num1= input.nextDouble();

        System.out.println("Enter number 2....");
        num2= input.nextDouble();


        //for do the mathematical operations
        if(operator==1){
            answer= sum(num1, num2);
            System.out.println("Answer is " + answer);
        }else if(operator==2){
            answer= difference(num1, num2);
            System.out.println("Answer is " + answer);
        }else if(operator==3){
            answer= multiplication(num1, num2);
            System.out.println("Answer is " + answer);
        }else if(operator==4){
            answer= division(num1, num2);
            System.out.println("Answer is " + answer);
        }else{
            System.out.println("Invalid operator");
        }


    }
}