import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Operators {

    // Complete the solve function below.

         static void solve(double meal_cost, double tip_percent, double tax_percent) {
        double tip = (meal_cost * tip_percent) / 100;
      
      double tax = (meal_cost * tax_percent) / 100;

        double totalcost = Math.round(meal_cost + tip + tax);   
         System.out.println((int)totalcost); 
    }
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
