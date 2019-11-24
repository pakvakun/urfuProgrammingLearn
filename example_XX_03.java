
/**
 * example_XX_03
 */
import java.util.Scanner;
public class example_XX_03 {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);

        System.out.println("Введите название недели");
        String DayOfWeek = In.next();
        System.out.println("Введите название месяца");
        String Month = In.next();
        System.out.println("Введите день в месяце");
        Integer Day = In.nextInt();

        System.out.printf("Вы ввели: %s %d %s \n", DayOfWeek, Day, Month);

        In.close();
    }
}