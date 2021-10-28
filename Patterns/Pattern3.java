// Made by https://github.com/VinuXD

/* To Print

1
2 1
3 2 1
4 3 2 1
5 4 3 2 1

*/

public class Pattern5 {
    public static void main(String ar[]) {
        int i, j;
        for(i=1;i<=5;i++) {
            for(j=i;j>=1;j--)
             System.out.print(j+" ");
            System.out.println();
        }
    }    
}