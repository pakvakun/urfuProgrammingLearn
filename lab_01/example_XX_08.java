
/**
 * example_XX_08
 */
import java.util.Scanner;
public class example_XX_08 {

    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);

        System.out.println("Это сумматор! \n\nВведите первое число");
        Integer FirstVar = In.nextInt();
        System.out.println("Введите второе число");
        Integer SecondVar = In.nextInt();

        System.out.println(FirstVar + SecondVar);
        
        In.close();
    }
}