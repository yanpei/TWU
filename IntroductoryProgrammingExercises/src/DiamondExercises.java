import java.util.Scanner;

/**
 * Created by pyan on 7/20/16.
 */
public class DiamondExercises {
    public static void isoscelesTriangle(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int m = 0; m < 2 * i - 1; m++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void diamond(int n){
        isoscelesTriangle(n);
        for(int i = n-1; i > 0; i--){
            for( int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int m = 0; m < 2 * i -1; m++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void diamondWithName(int n){
        for(int i = 1; i <= n; i++){
            if(i == n){
                System.out.println("YanPei");
            }else {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int m = 0; m < 2 * i - 1; m++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        for(int i = n-1; i > 0; i--){
            for( int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int m = 0; m < 2 * i -1; m++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args){
        System.out.println("Isosceles Triangle:");
        isoscelesTriangle(3);

        System.out.println("Diamond:");
        diamond(3);

        System.out.println("Diamond with Name:");
        diamondWithName(3);
    }
}
