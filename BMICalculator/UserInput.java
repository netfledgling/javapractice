package BMICalculator;

import java.util.Scanner;

public class UserInput {

    public String getSystem() {
        Scanner in = new Scanner(System.in);
        String BMISystem = "";

        System.out.println("-------------------------- BMI Calculator ---------------------");
        System.out.println("Enter your BMI system (Imperial / Metric): ");
        BMISystem = in.next().toUpperCase();

        if (!BMISystem.equals("IMPERIAL") && !BMISystem.equals("METRIC")) {
            BMISystem = "";
        }

        return BMISystem;
    }

    public double getHeight(String BMISystem) {

        double height = 0;
        boolean isInvalidInput = true;

        Scanner in = new Scanner(System.in);

        while (isInvalidInput) {

            switch (BMISystem) {
                case "IMPERIAL":
                    System.out.println("Enter your height in inches: ");
                    break;
                    
                case "METRIC":
                    System.out.println("Enter your height in meters: ");
                    break;

                case "":
                    System.out.println("Please enter a valid BMI System.");
                    break;
            }

            if (in.hasNextDouble()) { 
                height = in.nextDouble(); 
                isInvalidInput = false;
            }
            else { 
                System.out.println("Enter a valid height: ");
                height = 0;
            }
        }
        return height;
    }

    public double getWeight(String BMISystem) {

        double weight = 0; 
        boolean isInvalidInput = true;

        Scanner in = new Scanner(System.in);

        while (isInvalidInput) {

            switch (BMISystem) {
                case "IMPERIAL":
                    System.out.println("Enter your weight in pounds: ");
                    break;

                case "METRIC":
                    System.out.println("Enter your weight in kilos: ");
                    break;

                case "":
                    System.out.println("Please enter a valid BMI System. ");
                    break;
            }

            if (in.hasNextDouble()) {
                weight = in.nextDouble();
                isInvalidInput = false;
            }
            else {
                System.out.println("Please enter a valid weight: ");
                weight = 0;
            }
        }
        return weight; 
    }

}