import java.util.Scanner;

/**
 * ex02
 */
public class ex02 {

    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        String dayName = new String();
        int dayNumber;
        boolean loop = true;
        // String[] weekDayArr = {"понедельник","вторник","среда","четверг","пятница","суббота","воскресенье"};
            while(loop){
                System.out.println("Pls input name of day");
                dayName = In.next();
                loop = false;
                switch (dayName.toLowerCase()) {
                    case "понедельник":
                        dayNumber = 1;
                        break;
                    case "вторник":
                        dayNumber = 2;
                        break;
                    case "среда":
                        dayNumber = 3;
                        break;
                    case "четверг":
                        dayNumber = 4;
                        break;
                    case "пятница":
                        dayNumber = 5;
                        break;
                    case "суббота":
                        dayNumber = 6;
                        break;
                    case "воскресенье":
                        dayNumber = 7;
                        break;
                    default:
                        dayNumber = 0;
                        loop = true;
                        break;
                    }
                    if (dayNumber != 0) {
                        System.out.println(dayNumber);
                    }else{
                        System.out.println("Такого дня нет");
                        System.out.println(dayNumber);
                    }
                }
            In.close();
    }
}