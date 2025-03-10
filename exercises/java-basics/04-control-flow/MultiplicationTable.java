/*
 🔹 Task:
1️⃣ Create a Java program called MultiplicationTable.java
2️⃣ This program will generate and print the multiplication table of a given number.
3️⃣ Create a separate file called MultiplicationHelper.java that contains a method to print the multiplication table.
4️⃣ Use a for loop to generate and print the table from 1 to 10.
 */

 public class MultiplicationTable {
    public static void main (String[] args){
        for ( int i = 1; i <= 10; i++ ){
            System.out.println("5 * " + i + " = " + (5 * i));
        }
    }
 }