/**
 * Created by pyan on 7/21/16.
 */
public class FizzBuzzExercise {
    public static void FizzBuzz(int n){
        for(int i = 1; i <= n; i++){
            if(i % 15 == 0){
                System.out.println("FizzBuzz");
            }else if(i % 3 == 0){
                System.out.println("Fizz");
            }else if(i % 5 == 0){
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args){
        FizzBuzz(100);
    }
}
