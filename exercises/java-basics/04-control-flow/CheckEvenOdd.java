/*Exercise 1: Check If a Number is Even or Odd
🔹 Task:
1️⃣ Create a Java program called CheckEvenOdd.java
2️⃣ Take an int variable named number
3️⃣ If the number is even (number % 2 == 0), print "Even number"
4️⃣ Else, print "Odd number" */

public class CheckEvenOdd{
    public static void main(String[] args){
        int number = 53;

        if ( number % 2 == 0 ){
            System.out.println("Even Number ");
        } else {System.out.println("Odd number");
        }
    }
}