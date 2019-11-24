/**
 * example_XX_04
 */
import java.util.Scanner;

public class example_XX_04 {
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);

        System.out.println("Введите название месяца");
        String Month = In.next();
        Integer Day = 32;
        loop:
        while (Day > 31) {
            System.out.println("Введите количество дней в месяце");
            Day = In.nextInt();
            if (Day > 31) {
                System.out.println("В месяце не более 31 дня");
                continue loop;
            }
        }
        System.out.printf("Месяц %s содержит %d дней \n", Month, Day);
        In.close();
    }
}