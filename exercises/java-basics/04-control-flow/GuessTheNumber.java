/*
Write a Java program GuessTheNumber.java that:
1️⃣ Sets a secret number (e.g., 5).
2️⃣ Starts guessing from 1 and keeps increasing until it finds 5.
3️⃣ Uses a while loop to keep guessing until the guess is correct.
4️⃣ Prints each guess and when the number is found, prints:
"Correct! The number is 5!"
 */



public class GuessTheNumber {
    public static void main (String[] args){
        int random = 5;
        int i = 1;

        while(i < random){
            System.out.println(i);
            i++;
        }
        System.out.println("Correct! The number is 5!");
    }
    
}
