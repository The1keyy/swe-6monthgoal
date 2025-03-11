/*
 🏋️ while Loop Exercise: Sum Until 100 🚀
🔹 Problem Statement:
Write a Java program SumUntil100.java that:

1️⃣ Starts with sum = 0 and i = 1
2️⃣ Uses a while loop to keep adding i to sum
3️⃣ Stops when sum reaches or exceeds 100
4️⃣ Prints the total sum and "Sum exceeded 100!" when done
 */


public class SumUntil100 {
    public static void main (String [] args){
        int sum = 0;
        int i = 1;

        while (sum <= 100) {
            sum = sum + i;
            i++;
        }
        System.out.println("Final Sum: " + sum);
        System.out.println("Sum exceeded 100!");
    }
    
}
