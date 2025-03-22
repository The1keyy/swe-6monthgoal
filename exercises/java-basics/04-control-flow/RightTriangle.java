/*
  Nested Loop Exercise: Half-Pyramid of Numbers (NumberHalfPyramid.java) 
🔹 Problem Statement:
1️⃣ Write a Java program NumberHalfPyramid.java that prints a half-pyramid of numbers.
2️⃣ Use nested loops to print numbers in the following pattern.

✅ Expected Output
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
🔎 Hints to Solve This
1️⃣ Outer loop (i) controls the rows (from 1 to 5).
2️⃣ Inner loop (j) controls how many numbers are printed per row.
3️⃣ Use System.out.print(j + " "); to print numbers on the same line.
4️⃣ Use System.out.println(); to move to the next row.
 */

public class RightTriangle {
    public static void main(String[] args){
        for ( int i = 1; i <= 5; i++){
            for( int j = 1; j <= i ; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    
}
