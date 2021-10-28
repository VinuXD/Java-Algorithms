// Made by https://github.com/VinuXD

/* To Print

1
2 3
3 4 5
4 5 6 7
5 6 7 8 9

*/

public class Pattern6 {
    public static void main(String ar[]) {
        int i, j;
        for(i=1;i<=5;i++) {
            for(j=i;j<=2*i-1;j++)
             System.out.print(j+" ");
            System.out.println();
        }
    }    
}