/*
 🔹 Task:
1️⃣ Create a Java program called BMICheck.java
2️⃣ Define two double variables:

weight (in kilograms)
height (in meters)
3️⃣ Calculate the BMI using the formula:
java
Copy
Edit
double bmi = weight / (height * height);
4️⃣ Use if-else if-else to classify BMI:

If BMI is ≥ 30, print "Obese"
If BMI is between 25 and 29.9, print "Overweight"
If BMI is between 18.5 and 24.9, print "Normal weight"
Else, print "Underweight"

 */


public class BMICheck {
    public static void main(String[] args){
        double weight = 55;
        double height = 1.75;
        double bmi = weight / (height * height);

        if (bmi >= 30){
            System.out.println("Obese");
         } else if (bmi >= 25 && bmi <= 29.99){ 
            System.out.println("Overweight");
         } else if (bmi >= 18.5 && bmi <= 24.9 ){
            System.out.println("Normal Weight");
         } else System.out.println("Underweight");
        }
    }
    
