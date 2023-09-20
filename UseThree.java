package com.basics;

public class UseThree {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Please provide exactly three names.");
        } else {
            String name1 = args[0];
            String name2 = args[1];
            String name3 = args[2];
            System.out.printf("Hi %s, %s, and %s.%n", name3, name2, name1);
        }
    }
}
