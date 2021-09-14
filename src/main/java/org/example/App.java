/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nikolai Coletta
 */
package org.example;
import java.util.Scanner;

public class App
{
    static final double CONVERSION_FACTOR = 0.09290304;

    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.print( "What is the length of the room in feet? " );
        int length = Integer.parseInt( scan.nextLine() );

        System.out.print( "What is the width of the room in feet? " );
        int width = Integer.parseInt( scan.nextLine() );

        System.out.println( "You entered dimensions of " + length + " feet by " + width + " feet. \nThe area is" );

        int areaFeet = length * width;
        double areaMeters = areaFeet * CONVERSION_FACTOR;

        System.out.println(areaFeet + " square feet");
        System.out.println(areaMeters + " square meters");
    }
}
