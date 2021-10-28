// Made by https://github.com/VinuXD

/* To Print

5
4 4
3 3 3
2 2 2 2
1 1 1 1 1

*/

public class Pattern5 {
    public static void main(String ar[]) {
        int i, j;
        for(i=5;i>=1;i--) {
            for(j=1;j<=6-i;j++)
             System.out.print(i+" ");
            System.out.println();
        }
    }    
}