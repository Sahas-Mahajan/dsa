package com.dsa;
import java.util.Scanner;
public class StringBasics {

	public static void main(String[] args) {
		//Declaration and Initialization
		
		String str = "Java Program";
//		String str1 = new String("Java"); 
		
		//Accessing characters

		System.out.println("Character at index 1: " + str.charAt(1));

        // Finding String length using length()
        System.out.println("String length: " + str.length()); //counts whitespaces also

        // Updating a String
        str = "Java Programming";
        System.out.println("Updated string: " + str);
        // Strings are immutable, so here a new String is created

        // Traversing a String
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

        // Input a String (single word)
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a single word: ");
        String word = sc.next();

        System.out.println("Entered word: " + word);

        // Input a String (complete line)
        sc.nextLine(); 

        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Output a String
        System.out.println("Your sentence is: " + sentence);

        sc.close();
	}

}
