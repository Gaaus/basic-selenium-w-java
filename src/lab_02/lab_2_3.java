package lab_02;

import java.util.Scanner;

public class lab_2_3 {
    public static void main(String[] args) {
        System.out.print("Input height(m): ");
        Scanner scanner_h = new Scanner(System.in);
        float height = scanner_h.nextFloat();

        System.out.print("Input weight(kg): ");
        Scanner scanner_w = new Scanner(System.in);
        float weight = scanner_w.nextFloat();

        if (height > 0 && weight > 0) {
            float bmi = 1.0f * (weight / (height*2));
            // =< 18.5 , <= 24.9 , 29.9, else (> 29.9)
            System.out.printf("BMI: %f\n",1.0d*bmi);

            if (bmi <= 18.5) {
                System.out.println("Underweight. ");
                System.out.println("Let's planning to weight gain! Good luck!!!!");

            } else if (bmi <= 24.9) {
                System.out.println("Normal weight. ");
                System.out.println("Congrats, You have a perfect BMI! Let's keep it!");

            } else if (bmi <= 29.9) {
                System.out.print("Overweight! ");
                System.out.println("Let's go to Gym to burn some calories... You are nearly perfect!");


            } else {
                System.out.println("Obesity!!! ");
                System.out.println("Diet... Diet... You need to loose weight for a healthy life! Should you thinkin' about Low-Carb/Keto...");

            }

        } else {
            System.out.println("Wrong input, please input Non-Zero value for height & weight");
        }

    }
}
