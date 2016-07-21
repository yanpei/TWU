

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by pyan on 7/21/16.
 */
public class PrimeFactorsExercise
{
        public static ArrayList generate(int n){
        ArrayList factorsList = new ArrayList();
        if(n == 0 || n == 1){
            return factorsList;
        }
        ArrayList primaryNumber = getPrimeNumber(n);
        int number = n;
        while (number != 1){
            for (Object p : primaryNumber) {
                int i = Integer.parseInt(p.toString());
                if(number % i == 0){
                    factorsList.add(i);
                    number = number/i;
                    break;
                }
            }
        }
        return factorsList ;
    }

    public static ArrayList getPrimeNumber(int n){
        ArrayList primaryNumber = new ArrayList();
        for (int i = 2; i <= n; i++){
            for(int j = 2; j <= i; j++){
                if(i % j == 0 && i != j){
                    break;
                }
                if(i % j == 0 && i == j){
                    primaryNumber.add(i);
                }
            }
        }
        return primaryNumber;
    }

    public static void main(String[] args){
        System.out.print("Please input a number:");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList factorsList = generate(n);
        System.out.println("The prime factors of "+ n + ":");
        for (Object f:factorsList) {
            System.out.println(f.toString());
        }
    }
}
