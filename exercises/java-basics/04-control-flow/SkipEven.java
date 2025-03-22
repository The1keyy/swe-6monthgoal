/*
 
Exercise: Skip Even Numbers (SkipEven.java)
🔹 Task:
1️⃣ Use a for loop to print numbers from 1 to 10.
2️⃣ Use continue to skip even numbers (only print odd numbers).

 */


public class SkipEven {
    public static void main(String [] args){
        for( int i = 1 ; i <= 10 ; i++){
            if ( i % 2 == 0){
            continue;}
            System.out.println(i);
        }
    }
}
