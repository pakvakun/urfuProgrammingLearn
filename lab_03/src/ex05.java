import java.util.Arrays;
import java.util.Scanner;

/**
 * ex05
 */
public class ex05 {

    public static void main(String[] args) {
        Scanner In = new Scanner(System.in);
        
        
        System.out.println("Pls input digit");
        int sumLength = In.nextInt();
        int[] sumArr = new int[0];
        int iterator = 0;
        for(int i = 0; sumArr.length < sumLength; i++){
            if (i % 3 == 1 && i % 5 ==2) {
                if (sumArr.length == 0) {
                    sumArr = new int[sumArr.length + 1];
                    sumArr[sumArr.length - 1] = i;
                }else{
                    int[] temp = new int[sumArr.length + 1];
                    temp[sumArr.length - 1] = i;
                    System.arraycopy(sumArr, 0, temp, 0, sumArr.length);
                    temp[sumArr.length] = i;
                    sumArr = temp;
                }
            }
        }
        System.out.println(Arrays.toString(sumArr));
        
        while (sumArr.length < sumLength) {
            if (iterator % 3 == 1 && iterator % 5 ==2) {
                if (sumArr.length == 0) {
                    sumArr = new int[sumArr.length + 1];
                    sumArr[sumArr.length - 1] = iterator;
                }else{
                    int[] temp = new int[sumArr.length + 1];
                    temp[sumArr.length - 1] = iterator;
                    System.arraycopy(sumArr, 0, temp, 0, sumArr.length);
                    temp[sumArr.length] = iterator;
                    sumArr = temp;
                }
            }
            iterator++;
        }
        System.out.println(Arrays.toString(sumArr));
        In.close();
    }
}