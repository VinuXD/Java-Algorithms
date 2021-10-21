// Made By https://github.com/VinuXD

// Basic operators

class BasicOperators {
    public static void main(String args[]) {
        int a = Integer.parseInt(args[0]); // Getting a in Command Line as a Integer
        int b = Integer.parseInt(args[1]); // Getting b in Command Line as a Integer
        int d,s;
        s = a + b; // Storing value of a+b in varibale s
        if(a>b) // Yes, We don't need answer in negative values!
         d = a - b;
        else
         d = b - a;
        System.out.println("Sum        : " +s);
        System.out.println("Difference : " +d);
        System.out.println("Product    : " +a*b);
        System.out.println("Quotient   : " +a/b); // Dividing by Zero can cause Exception
        System.out.println("Reminder   : " +a%b);
        
    }
}