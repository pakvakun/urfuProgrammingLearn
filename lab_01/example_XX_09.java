
/**
 * example_XX_09
 */
import java.util.Scanner;
public class example_XX_09 {

    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);

        System.out.println("Введите число");
        Double Var = In.nextDouble();

        System.out.printf("%.0f %.0f %.0f %.0f \n", Var - 1, Var, Var + 1, Math.pow((Var - 1) + Var + (Var + 1), 2) );

        In.close();
    }
}