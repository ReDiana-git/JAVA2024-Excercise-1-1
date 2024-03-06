package nl0e0.nl;

import java.util.Scanner;

public class CaculatingBMI {
    public static void main(String[] args) {
        System.out.println("Welcome to the BMI (Body Mass Index) calculator");

        System.out.print("Please enter your weight (kilograms): ");
        Scanner input = new Scanner(System.in);
        float weight = input.nextFloat();

        System.out.print("Please enter your height (centimeters): ");
        float height = input.nextFloat() / 100;

        float BMI = weight / height / height;

        String evaluation;
        if(BMI < 18.5)
            evaluation = "Underweight";
        else if ((BMI >= 18.5) && (BMI < 25)) 
            evaluation = "Normal";
        else if ((BMI >= 25) && (BMI < 30))
            evaluation = "Overweight";
        else
            evaluation = "Obese";


        System.out.println("Your BMI is " + String.format("%.1f", BMI) + " " + evaluation);
    }
}