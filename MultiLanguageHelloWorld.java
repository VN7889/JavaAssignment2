package com.basics;

import java.util.Scanner;

public class MultiLanguageHelloWorld {
    public static void main(String args[]){
        System.out.println("Enter the number to print the hello world statement in desired language");
        Scanner n = new Scanner(System.in);
        System.out.println(" 0 - English \n 1 - Telugu \n 2 - Hindi \n 3 - Malay \n 4 - Marathi");
        System.out.println("Enter the desired number: ");
        // Takes the User Input.
        int num = n.nextInt();
        // Using switch-case to print the hello world in desired language .
        switch(num){
            case 0:
                System.out.println("Hello World!");
                break;
            case 1:
                System.out.println("హలో వరల్డ్!");
                break;
            case 2:
                System.out.println("नमस्कार दुनिया !");
                break;
            case 3:
                System.out.println("Hai dunia!");
                break;
            case 4:
                System.out.println("हॅलो वर्ल्ड!");
                break;
        }
    }
}
