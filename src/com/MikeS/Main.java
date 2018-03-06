package com.MikeS;

public class Main {

    public static void main(String[] args) {
	int myIntValue =5;
	float myFloatValue = (float) 5.0;
	double myDoubleValue = 5.0;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        System.out.println();

        char c = 'g' ;
        System.out.print(c);

        String myString;
        myString = "450.34";


        try {
            myIntValue =  Integer.parseInt(myString);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }


        System.out.println("myIntValue = " + myIntValue);

        myString = "450.87";
        myFloatValue =  Float.parseFloat(myString);
        System.out.println("myFloatValue = " + myFloatValue);
    }
}
