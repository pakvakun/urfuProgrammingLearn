import java.util.Arrays;
import java.util.Scanner;

/**
 * ex03
 */
public class ex03 {

    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        
        
        System.out.println("Pls input length of fib");
        int fibLength = In.nextInt();
        if(fibLength <= 0){
            System.out.println(0);
        }else if (fibLength == 1) {
            System.out.println(1);
        }else{
            int[] FirstNumsArr = new int[fibLength];
            int[] SecondNumsArr = new int[fibLength];
            int startingValue = 2;
            FirstNumsArr[0] = SecondNumsArr[0] = 1;
            FirstNumsArr[1] = SecondNumsArr[1] = 1;
            for(int i = startingValue; i < FirstNumsArr.length; i++){
                FirstNumsArr[i] = FirstNumsArr[i - 1] + FirstNumsArr[i - 2];
            }
            while (startingValue < SecondNumsArr.length) {
                SecondNumsArr[startingValue] = SecondNumsArr[startingValue - 1] + SecondNumsArr[startingValue - 2];
                startingValue++;
            }
            System.out.println(Arrays.toString(FirstNumsArr));
            System.out.println(Arrays.toString(SecondNumsArr));
        }
        In.close();
    }
}