import java.util.Arrays;
import java.util.Scanner;

/**
 * ex04
 */
public class ex04 {

    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        
        
        System.out.println("Pls input 2 digits");
        int firstDigit = In.nextInt(),
            secondDigit = In.nextInt();
            
        if (firstDigit > secondDigit) {
            int temp = firstDigit;
            firstDigit = secondDigit;
            secondDigit = temp;
        }
        int ite = firstDigit;
        while (ite <= secondDigit) {
            System.out.println(ite);
            ite++;
        }
        for(int i = firstDigit; i <= secondDigit; i++){
            System.out.println(i);
        }
        In.close();
    }
}