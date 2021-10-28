// Made by https://github.com/VinuXD

/* To Print

A
B B
C C C
D D D D
E E E E E

*/

public class Pattern4 {
    public static void main(String ar[]) {
        int i, j;
        for(i=1;i<=5;i++) {
            for(j=1;j<=i;j++)
             System.out.print((char)(i+64)+" ");
            System.out.println();
        }
    }    
}