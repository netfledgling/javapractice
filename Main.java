package BMICalculator;

public class Main {
    public static void main(String[] args) {

        double bmi = 0;
        double height, weight; 
        String bmiSystem;
        String bmiCategory;

        UserInput userInput = new UserInput();
        BMICalculator bmiCalculator = new BMICalculator();

        bmiSystem = userInput.getSystem();
        height = userInput.getHeight(bmiSystem);
        weight = userInput.getWeight(bmiSystem);

        switch (bmiSystem.toUpperCase()) {
            case "IMPERIAL":
                bmi = bmiCalculator.calculateBMIImperial(height, weight);
                break;

            case "METRIC":
                bmi = bmiCalculator.calculateBMIMetric(height, weight);
                break;

            case "": 
                System.out.println("Please enter a valid BMI System");
                break;
        }

        bmiCategory = bmiCalculator.getBMICategory(bmi);
        System.out.println("Your BMI indicates that you are " + bmiCategory);
    }
    
}
