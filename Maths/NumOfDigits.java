// Made by https://github.com/VinuXD

// To find the number of digits in in given number

class NumOfDigits {
    public static void main(String args[]) {
        int n = Integer.parseInt(args[0]);
        int s = 0; // Initializing
        while(n!=0) {
            s = s + 1;
            n = n / 10;
        }
        System.out.println("Total Digits : "+s);
    }
}