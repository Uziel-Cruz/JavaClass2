package com.company;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
	// TASK 1 PRIMITIVE TYPES QUIZ-----------------------------------------------------------------------
       // System.out.println('a' + 'A');
       // System.out.println("\"");
       // System.out.println("what will be the result of this addition? " + 1 + 2 + 3);
       // System.out.println(1 + 2 + 3 + "and what will the result be here?");
       // System.out.println("what will be the result of this addition?" + (1+2+3));

       // boolean boolExample = !(true);
       // System.out.println(boolExample);

        // byte data type, so 8 bit integer
       // byte by =(byte)135;
       // System.out.println(by);
       // byte bySecond =(byte)256;
       // System.out.println(bySecond);

        //why is there a mistake here?
        //int i=12345678901234567;
        //why is there a mistake here?
        //long lg=12345678901234567;
        //what's going on here
        //char c=0x6d;
        //char d=0155;
        //System.out.println(c + "=" +d);

       // double roundingExample = 2.0 - 1.9;
       // System.out.println(roundingExample);

        //Find the value of a variable
       // int a =100000000;
       // System.out.println("Here the variable has a value of " + a);

       // a +=100000000;
       // System.out.println("Here the variable has a value of " + a);

       // a +=100000000;
       // System.out.println("Here the variable has a value of " + a);

       // a +=100000000;
       // System.out.println("Here the variable has a value of " + a);

        //what will be printed to the console after this program runs:
       // System.out.println(2147483647 + 1);
       // System.out.println(2147483647L + 1);

       // int  value = 123_45_67_89;
       // System.out.println("value of a variable is: " +value);

       // int x1 =40;
       // int y1 =10;

       // x1 += y1;
       // System.out.println("Now x1 has value: " + x1);
       // x1 =+ y1;
       // System.out.println("Now x1 has value: " + x1);

       // int x = 899;
       // short y = 10;
       // x=y;

    // Task 2- HOW MUCH DO YOU WEIGHT ON MARS?------------------------------------------------------------------

      //float earthWeight;
      //float marsWeight;
      //double marsWeightInDouble;
      //int marsWeightInInt;

      //earthWeight = 84;
      //marsWeight= (earthWeight + 0.38F);
      //System.out.println(earthWeight + "kg on  Earth is" + marsWeight + "kg on mars");

      //assignment compatible types from float to double
       // marsWeightInDouble=marsWeight;
       // System.out.println("Kilograms on mars after conversion to double" + marsWeightInDouble);
        //printing a variable limiting the length of printing to 4 decimal places
       // System.out.printf("Kilograms on mars displayed to four decimal places: %.4f %n", marsWeightInDouble);
        // a floating point type cast to integer
       // marsWeightInInt=(int)marsWeightInDouble;
       // System.out.println("kilograms on mars when casted to integer " + marsWeightInInt);
        //casting an int type to char
       // char c = (char)marsWeightInInt;
       // System.out.println("The ASCII table equivalent to marsWeightInInt is: " +c);
        //assign the value of performing some mathematical operation on the char character to the new int variable
       // int exampleOfMathOnChar= c*c;
       // System.out.println("An example of a mathematical operation on a char type can be: " + exampleOfMathOnChar);

    // TASK 3- EVEN OR NOT EVEN?-------------------------------------------------------------------------------

        //generating a random number from 1 to 100
       // int randomNum=(int) (Math.random() * (100 - 1));
        //checking if it is even or odd
      //  if (randomNum%2==0){
         //   System.out.println(randomNum + "is an even number");
       // } else {
           // System.out.println(randomNum + "is an odd number");
        //}

      // TASK 4- HOW MANY CONTAINERS PER BLOCKSNEED?------------------------------------------------------------

        //odd number of legos we have
        //int amountOfBricks =77;

        //even number of legos that fit in one container
        //int containerCapacity = 6;

        //Calculation of the containers not full
        //int Unfilled = amountOfBricks % containerCapacity;
        //System.out.println("The number of unfilled containers is: " + Unfilled);

        // Calculation for Filled containers
        //int filled = amountOfBricks / containerCapacity;
        //System.out.printf("Number of containers filled is: " + filled);

        //The amount of containers in general
        //int totalC = filled + Unfilled;
        //System.out.println("Number of containers in total is " + totalC);

      // Task 5- HOW NOT TO CALCULATE THE TAX IN JAVA LANGUAGE---------------------------------------------------------

        double priceWithoutVat =9.99;
        System.out.println("Price without Vat: " + priceWithoutVat);

        double priceWithVat = priceWithoutVat * 1.23;
        System.out.println("Price with Vat: " + priceWithVat);

        double valueWithVat= priceWithVat * 10000;
        System.out.println("Value with Vat: " + valueWithVat);

        double priceWithoutVat2 = valueWithVat / 1.23;
        System.out.println("Value without Vat: " + priceWithoutVat2);

        //Using the BigDecimal class
        System.out.println(" ");
        BigDecimal dbPriceWithoutVat= new BigDecimal("9.99");
        System.out.println("Price without Vat: " + dbPriceWithoutVat);

        BigDecimal dbPriceWithVat= dbPriceWithoutVat.multiply(
                new BigDecimal("1.23"));
        dbPriceWithVat=dbPriceWithVat.setScale(2,BigDecimal.ROUND_HALF_EVEN);
        System.out.println("Price with Vat rounded: " + dbPriceWithVat);

        BigDecimal dbValueWithVat=dbPriceWithVat.multiply(
        new BigDecimal(10000));
        System.out.println("Value with Vat: " + dbValueWithVat);
    }
}
