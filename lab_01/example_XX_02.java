
/**
 * example_XX_02
 */
import java.util.Scanner;
public class example_XX_02 {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Pls Input name...");
        String Name = Input.next();
        System.out.println("Pls Input years old");
        Integer Age = Input.nextInt();
        System.out.printf("I know you name. This is %s and you %d Y.O. \n", Name, Age);

        Input.close();
    }
}