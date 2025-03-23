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

*/
 public class FavoriteQuote{
    public static void main (String [] args){
        String quote = "Success is not final, failure is not fatal";
        for ( int i = 0 ; i < quote.length() ; i++){
            System.out.println("Character at index " + i + " : " + quote.charAt(i));
        }
    }
 }