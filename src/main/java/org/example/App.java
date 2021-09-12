/*
 *  UCF COP3330 Fall 2021 Assignment 9 Solution
 *  Copyright 2021 David Panchak
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        int sqFeetPerGallon=350;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter length: ");
        double length=input.nextDouble();
        System.out.print("Enter width: ");
        double width=input.nextDouble();

        double sqFeet=length*width;
        double numGallons=Math.ceil(sqFeet/sqFeetPerGallon);

        System.out.printf("You will need to purchase %.0f gallons of paint to cover %.0f square feet.",numGallons,sqFeet);
    }
}
