import java.util.*;

public class AnalyzeNumbers {
    public static void main(String[] args) {
        System.out.println("------------------");
        System.out.println("Author: JealousGx");
        System.out.println("------------------");
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int n = input.nextInt();
        double[] numbers = new double[n];
        double sum = 0;
    
        System.out.println("Enter the " + numbers.length + " numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }
        
        double average = sum / n;
    
        int count = 0; // The numbers of elements above average
        for (int i = 0; i < n; i++) 
            if (numbers[i] > average)
            count++;
    
        System.out.println("Average is " + average);
        System.out.println("Number of elements above the average is " + count);
        }
  }
  