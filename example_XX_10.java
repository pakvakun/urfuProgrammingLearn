
/**
 * example_XX_10
 */
import java.util.Scanner;
public class example_XX_10 {

    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);

        System.out.println("Pls Input 2 digits");
        Integer First = In.nextInt();
        Integer Second = In.nextInt();

        System.out.printf("sum: %d \ndiff: %d\n", First + Second, First - Second);

        In.close();
    }
}