/**
 * first
 */
import java.util.Scanner;

public class example_XX_01 {

    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        System.out.println("Pls Input you First Name");
        String FN = In.next();
        System.out.println("Pls Input you Last Name");
        String LN = In.next();
        System.out.println("Pls Input you Middle Name");
        String MN = In.next();
        
        System.out.printf("Hallo %s %s %s \n", LN, FN, MN);

        In.close();
    }
}