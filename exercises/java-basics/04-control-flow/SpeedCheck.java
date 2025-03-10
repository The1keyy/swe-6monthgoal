/*
1️⃣ Create a Java program called SpeedCheck.java
2️⃣ Define an int variable speed
3️⃣ Use an if-else if-else statement:

If speed > 100, print "You are speeding! Slow down!"
If speed is between 60 and 100, print "You are driving at a safe speed."
Else, print "You are driving too slow!"
 */

public class SpeedCheck {
    public static void main(String[] args){
        int speed = 61;

        if (speed > 100){
            System.out.println("You are speeding! Slow down!");
        } else if (speed > 60 && speed < 100){
            System.out.println("You are driving at a safe speed.");
        } else {System.out.println("You are driving too slow!");
    }
    }
    
}
