// Made by https://github.com/VinuXD

// To Interchages the values of given numbers

public class Interchange {
    public static void main(String args[]) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("a = " +a+" b = "+b); // To check the values at end
        a = a + b;
        b = a - b;
        a = a - b; // Workout in paper xD
        System.out.println("Below values are Interchanged");
        System.out.println("a = " +a+" b = "+b);
    }
}
