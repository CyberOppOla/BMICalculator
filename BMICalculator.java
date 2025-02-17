// This program calculates BMI and categorizes weight status
import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input
        System.out.print("Enter weight (kg): ");
        double weight = scanner.nextDouble();
        
        System.out.print("Enter height (m): ");
        double height = scanner.nextDouble();
        
        // Check for invalid height
        if (height <= 0) {
            System.out.println("Height must be greater than zero.");
            return;
        }
        
        // BMI Calculation
        double bmi = weight / (height * height);
        
        // Determine BMI category
        String category;
        if (bmi < 18.5) {
            category = "Underweight";
        } else if (bmi < 24.9) {
            category = "Normal weight";
        } else if (bmi < 29.9) {
            category = "Overweight";
        } else {
            category = "Obese";
        }
        
        // Display result
        System.out.printf("Your BMI is %.2f. You are in the %s category.%n", bmi, category);
        scanner.close();
    }
}
