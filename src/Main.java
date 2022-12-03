import java.util.Scanner;

public class Main{
    public static void butterfly(int n ){
       //outer loop
        for (int i=1;i<=n;i++){
            //inner loop
            //stars
            for (int j =1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for (int j =1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //second half
        for (int i=n;i>=1;i--){
            //inner loop
            //stars
            for (int j =1;j<=i;j++){
                System.out.print("*");
            }
            //spaces
            for (int j =1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //stars
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public static void main(String arg[]){
        butterfly(10);
    }


}