import java.util.Scanner;

/**
 * ex01
 */
public class ex01 {

    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        String dayIs = new String();
        int dayNumber;
        boolean loop = true;
            while(loop){
                System.out.println("Pls input numer of day");
                dayNumber = In.nextInt();
                loop = false;
                switch (dayNumber) {
                    case 1:
                        dayIs = "Понедельник";
                        break;
                    case 2:
                        dayIs = "Вторник";
                        break;
                    case 3:
                        dayIs = "Среда";
                        break;
                    case 4:
                        dayIs = "Четверг";
                        break;
                    case 5:
                        dayIs = "Пятница";
                        break;
                    case 6:
                        dayIs = "Суббота";
                        break;
                    case 7:
                        dayIs = "Воскресенье";
                        break;
                    default:
                        dayIs = "Такого дня нет";
                        loop = true;
                        break;
                    }
                    System.out.println(dayIs);
                }
            In.close();
    }
}