/**
 Create a class called FavoriteNumbers.java
Inside:

Declare an int[] array of 3 elements

Assign your 3 favorite numbers

Print them all using System.out.println()
 

public class FavoriteNumbers {
    public static void main(String[] args){
        int[] favorite = new int[3];

        favorite[0] = 5;
        favorite[1] = 2;
        favorite[2] = 1;

        System.out.println( favorite[0]);
        System.out.println( favorite[1]);
        System.out.println( favorite[2]);
    }
}
    

Calculate the sum of the three numbers

Print the result with a message like:

The sum of my favorite numbers is: 8 

public class FavoriteNumbers {
    public static void main (String[] args) {
        int[] favorite = new int[3];

        favorite[0] = 5;
        favorite[1] = 2;
        favorite[2] = 1;
        
        System.out.println("The sum of my favorite numbers is: " + ( favorite[0] + favorite[1] + favorite[2]));

    }
} 
    🔹 Exercise Instructions:
1️⃣ Create (or reuse) your FavoriteNumbers class
2️⃣ Use a for loop to:

Print each number in the array

Add them to a variable called sum
3️⃣ Print the total sum after the loop */

