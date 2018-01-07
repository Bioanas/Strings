package com.ia;

public class Main {

    public static void main(String[] args) {
	String myString = "This is a string";
        System.out.println("My string is equal to " + myString);
        myString = myString + ", and this is more";
        System.out.println("My string is equal to " + myString);
        myString = myString + " \u00A9 2015";
        System.out.println("My string is equal to " + myString);
        String stringNumber = "250.55";
        stringNumber = stringNumber + "49.95";
        System.out.println("My stringNumber is equal to " + stringNumber);

        String lastString = "18";
        int myInteger = 50;
        lastString = lastString + myInteger;
        System.out.println("My string is equal to " + lastString);

        double doubleNumber = 120.47;
        lastString = lastString +doubleNumber;
        System.out.println("My string is equal to " + lastString);
    }
}
