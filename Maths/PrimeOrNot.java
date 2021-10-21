// Made by https://github.com/VinuXD

// To find the given number prime or not

public class PrimeOrNot {
    public static void main(String args[]) {
        int n = Integer.parseInt(args[0]);
        int i;
        boolean p = true; 
        for(i=2;i<=n/2;i++)
         if(n%i==0) {
             p = false;
             break; // Should break the statement
         }
         if(p)
          System.out.println(n+ " is a prime number");
         else 
          System.out.println(n+ " is not a prime nummber");
    }
    
}
