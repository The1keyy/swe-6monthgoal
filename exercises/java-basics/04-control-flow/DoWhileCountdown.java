/*
 

Write a Java program DoWhileCountdown.java that:

1️⃣ Starts with count = 10
2️⃣ Uses a do-while loop to count down from 10 to 1
3️⃣ Prints "Liftoff!" after the countdown ends


 */


public class DoWhileCountdown {
    public static void main(String [] main){
        int count = 10;

        do{
            System.out.println(count);
       count--; } while(count >= 1);
       System.out.println("Liftoff!");
    }
    
}
