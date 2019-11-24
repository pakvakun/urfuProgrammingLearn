
/**
 * five
 */
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class example_XX_05 {
    
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);

        System.out.println("Введите год рождения");
        Integer BornYear = In.nextInt();

        Date dateNow = new Date();
        SimpleDateFormat formattedDate = new SimpleDateFormat("yyyy");
        Integer dateNowInt = Integer.parseInt(formattedDate.format(dateNow));

        System.out.printf("you %d Y.O.", dateNowInt - BornYear);

        In.close();
    }
}