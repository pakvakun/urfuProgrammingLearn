
/**
 * example_XX_06
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class example_XX_06 {

    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);

        System.out.println("Введите имя");
        String name = In.next();
        
        System.out.println("Введите год рождения");
        Integer BornYear = In.nextInt();

        Date dateNow = new Date();
        SimpleDateFormat formattedDate = new SimpleDateFormat("yyyy");
        Integer dateNowInt = Integer.parseInt(formattedDate.format(dateNow));

        System.out.printf("you name is %s and you %d Y.O. \n",name,  dateNowInt - BornYear);

        In.close();
    }
}