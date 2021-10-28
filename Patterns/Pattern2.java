// Made by https://github.com/VinuXD

/* To Print

1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

*/

public class Pattern4 {
    public static void main(String ar[]) {
        int i, j;
        for(i=5;i>0;i--) {
            for(j=1;j<=i;j++)
             System.out.print(j+" ");
            System.out.println();
        }
    }    
}