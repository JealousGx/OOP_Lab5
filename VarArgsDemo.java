//Code
public class VarArgsDemo {
    public static void main(String args[]) {
        System.out.println("------------------");
        System.out.println("Author: JealousGx");
        System.out.println("------------------");
        
        printMax(34, 3, 3, 2, 56.5); //it is same like passing array, while invoking method
        printMax(new double[]{1, 2, 3}); //it is same like passing array, while invoking method
    }
  
    public static void printMax(double... numbers) {   
    //printMax(double[] numbers) can work with printMax(new double[]{1, 2, 3}) 
    //but not with printMax(34, 3, 3, 2, 56.5) because it does not look like passing array
        if (numbers.length == 0) {
            System.out.println("No argument passed");
            return; // no use of return keyword, nothing is returned.
        }
    
        double result = numbers[0];
    
        for (int i = 1; i < numbers.length; i++)
            if (numbers[i] > result)
            result = numbers[i];
    
        System.out.println("The max value is " + result);
        }
  }
  