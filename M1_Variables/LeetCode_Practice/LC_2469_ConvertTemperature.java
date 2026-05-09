/**
 * LEETCODE ID: 2469
 * TITLE: Convert the Temperature
 * DIFFICULTY: Easy
 * 
 * PROBLEM STATEMENT:
 * You are given a non-negative floating point number rounded to two decimal places 
 * celsius, that denotes the temperature in Celsius.
 * You should convert Celsius into Kelvin and Fahrenheit and return it as an array.
 * 
 * FORMULAS:
 * Kelvin = Celsius + 273.15
 * Fahrenheit = Celsius * 1.80 + 32.00
 * 
 * CONSTRAINTS:
 * 0 <= celsius <= 1000
 */

public class LC_2469_ConvertTemperature {
    
    public double[] convertTemperature(double celsius) {
        // Kelvin calculation
        double kelvin = celsius + 273.15;
        
        // Fahrenheit calculation
        double fahrenheit = celsius * 1.80 + 32.00;
        
        // Returning as an array (Collection of variables)
        return new double[]{kelvin, fahrenheit};
    }

    public static void main(String[] args) {
        LC_2469_ConvertTemperature solution = new LC_2469_ConvertTemperature();
        
        double celsius = 36.50;
        double[] result = solution.convertTemperature(celsius);
        
        System.out.println("Input: Celsius = " + celsius);
        System.out.println("Output: Kelvin = " + result[0] + ", Fahrenheit = " + result[1]);
    }
}

/**
 * EXPLANATION:
 * This problem focuses on floating-point precision. 
 * 
 * WHY IN THIS MODULE?
 * It teaches the importance of the 'double' data type for scientific calculations
 * where decimal values are involved.
 */
