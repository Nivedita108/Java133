package Unit3;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int a[][]=new int[sc.nextInt()][sc.nextInt()];
        System.out.println("Enter elements");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++) {
                System.out.println(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}

