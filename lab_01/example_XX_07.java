
/**
 * example_XX_07
 */
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class example_XX_07 {
    
    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);

        System.out.println("Введите возраст");
        Integer Age = In.nextInt();

        Date dateNow = new Date();
        SimpleDateFormat formattedDate = new SimpleDateFormat("yyyy");
        Integer dateNowInt = Integer.parseInt(formattedDate.format(dateNow));

        System.out.printf("you born in  %d year \n", dateNowInt - Age);

        In.close();
    }
}