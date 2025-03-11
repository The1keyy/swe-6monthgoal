/*
1️⃣ Use a for loop to check numbers from 1 to 20.
2️⃣ Stop the loop when you find the first multiple of 7 using break.
3️⃣ Print "First multiple of 7 found: X" and exit

 */

 public class FindMultiple{
    public static void main(String [] args){
        for( int i = 1 ; i <= 20 ; i++){
            if ( i % 7 == 0){
                System.out.println("First multiple of 7 found: " + i);
                break;
            }
            System.out.println(i);
        }
    }
 }