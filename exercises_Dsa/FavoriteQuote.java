/*
 Create a new Java class called FavoriteQuote

Inside the main method, do the following:

Create a String variable named quote

Assign it a sentence like:
"Success is not final, failure is not fatal."

Print it using System.out.println(quote);
 

public class FavoriteQuote{
    public static void main(String [] args){
        String quote = "Success is not final, failure is not fatal";
        System.out.println(quote);
    }
    
}

String Exercise: Analyze the Quote
 Your Task:
Given this string:

String quote = "Success is not final, failure is not fatal";
 Write a Java program that prints:

The full quote

The length of the string

The first character

The last character


    
public class FavoriteQuote{
    public static void main (String [] args){
        String quote = "Success is not final, failure is not fatal";
        System.out.println(quote);
        System.out.println("length: " + quote.length());
        System.out.println("The first character " + quote.charAt(0));
        System.out.println("The last character " + quote.charAt(quote.length() - 1));
    }
}

Write a program that:

Loops through the string character by character

Prints each character on a new line

Also prints the index with it like:


 public class FavoriteQuote{
    public static void main (String [] args){
        String quote = "Success is not final, failure is not fatal";
        for ( int i = 0 ; i < quote.length() ; i++){
            System.out.println("Character at index " + i + " : " + quote.charAt(i));
        }
    }
 }  

 You’re still working with this quote:
String quote = "Success is not final, failure is not fatal";
Write a Java program that:

Extracts and prints the word "Success" using .substring()

Extracts and prints the word "failure"

Extracts and prints the last word "fatal"




 public class FavoriteQuote{
    public static void main(String [] args){
        String quote = "Success is not final, failure is not fatal";

        String word1 = quote.substring(0, 7);
        String word2 = quote.substring(22, 29);
        String word3 = quote.substring(37,42 );

        System.out.println(word1 + " " + word2 + " " + word3);
    }
 }

Write a program that:

Loops through the string backwards

Builds and prints the reversed string:



public class FavoriteQuote{
    public static void main(String [] args){
        String name = "Keyshawn";
        String reverse = "";

        for( int i = name.length() - 1 ; i >= 0 ; i -- ){
        reverse += name.charAt(i);
        }
        System.out.println("Reverse: " + reverse);
    }
}

Write a Java program that:

Stores a word (like "madam" or "racecar")

Reverses the string (like you just did before)

Compares the original and reversed string using .equals()

Prints whether it is or is not a palindrome


*/

public class FavoriteQuote{
    public static void main(String [] args){
        String word = "madam";
        StringBuilder reverse = new StringBuilder();

        for( i = word.length(); i > 0 ; i--){

        }


    }
}