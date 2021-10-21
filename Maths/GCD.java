// Made by https://github.com/VinuXD

// To find GCD of two numbers

public class GCD {
    public static void main(String args[]) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int i, g = 1;
        for(i=1;i<=Math.min(a, b);i++) 
         if(a%i==0 && b%i==0) // Checking if reminder of a & b equals 0
          g = i;
        System.out.println("Greatest Common Divisor is "+g);
    }
    
}
