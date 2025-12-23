package BMICalculator;

public class BMICalculator {

    public double calculateBMIImperial(double height, double weight) {
        return 703*(weight/(height*height));
    }

    public double calculateBMIMetric(double height, double weight) {
        return weight/(height*height);
    }

    public String getBMICategory(double bmi) {
        String BMICategory = "";

        if (bmi < 18.5) { BMICategory = "Underweight"; }
        else if (18.5 <= bmi && bmi <= 24.9) {BMICategory = "Normal Weight"; }
        else if (25 <= bmi && bmi <=29.9) {BMICategory = "Overweight"; }
        else if ( bmi >= 30) {BMICategory = "Obese"; }
        else {BMICategory = "Unsure, please input your values again."; }

        return BMICategory;
    }


    
}
