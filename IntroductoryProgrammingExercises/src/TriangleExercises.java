/**
 * Created by pyan on 7/20/16.
 */
public class TriangleExercises {

    public static void easiestExerciseEver(){
        System.out.println("*");
    }

    public static void drawAHorizontalLine(int n){
        for (int i = 0; i < n; i++){
            System.out.print("*");
        }
        System.out.println();
    }

    public static void drawAVerticalLine(int n){
        for(int i = 0; i < n; i++){
            System.out.println("*");
        }
    }

    public static void drawARightTriangel(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1 ; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){

        System.out.println("Easiest exercise ever:");
        easiestExerciseEver();

        System.out.println("Draw a horizontal line:");
        drawAHorizontalLine(8);

        System.out.println("Draw a vertical line");
        drawAVerticalLine(3);

        System.out.println("Draw a right triangle:");
        drawARightTriangel(3);
    }
}
