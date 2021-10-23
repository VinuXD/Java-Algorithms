// Made by https://github.com/VinuXD

// To find Factorial of a number

public class Factorial {
    public static void main(String args[]) {
        int n,i;
        long s=1; // Helpful if user needs a Accurate answer
        n = Integer.parseInt(args[0]);
        for(i=1;i<=n;i++)
         s = s * i;
        System.out.println("Factorial of "+n+" is = "+s);
    }
    
}
