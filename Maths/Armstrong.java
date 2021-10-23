// Made by https://github.com/VinuXD

// To find the given number Armstrong or not

public class Armstrong {
    public static void main(String args[]) {
        int n = Integer.parseInt(args[0]);
        int h, t, o, s=0;
        h = n/100;
        t = n % 100 / 10;
        o = n % 10;
        s = h * h * h + t * t * t + o * o * o;
        if(s==n)
         System.out.println(n+ " is a Armstrong Number");
        else
        System.out.println(n+ " is not a Armstrong Number");       
    }
    
}
