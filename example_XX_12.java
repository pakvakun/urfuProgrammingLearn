/**
 * example_XX_12
 */
public class example_XX_12 {

    static double a =10.0, b=4.0, c, d;
    public static double hyp(double katA, double katB){
        return Math.sqrt(katA*katA + katB*katB);
    }
public static void main(String[] args) { 
    System.out.println("katet а=" + a); 
    System.out.println("katet b=" + b); 
    System.out.println("hypotenuse с=" + hyp(a, b));
}
}