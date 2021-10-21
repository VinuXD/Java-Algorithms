// Made by https://github.com/VinuXD

// To find the Digit sum of any number

public class DigitSum {
    public static void main(String args[]) {
        int n = Integer.parseInt(args[0]);
        int a = n; // Shifting value of 'n' to 'a'
        int s = 0; // Initializing s
        while(n!=0) 
         {
             s = s + n % 10;
             n = n / 10;
         }
         System.out.println("Digit Sum of "+a+" is "+s); // Printing 'a' because the value of 'n' is 0 when the loop ends
    }
    
}
