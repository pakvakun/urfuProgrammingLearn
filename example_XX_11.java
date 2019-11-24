/**
 * example_XX_11
 */
public class example_XX_11 {

    static double a =10.0, b=4.0, c, d;
    public static double hyp(){
        return c = Math.sqrt(a*a + b*b);
    }
    public static double AinB() {
        return d = Math.round(Math.exp(b*(Math.log(a))));
    }
public static void main(String[] args) { 
    System.out.println("katet а=" + a); 
    System.out.println("katet b=" + b); 
    System.out.println("hypotenuse с=" + hyp());
    System.out.println("a^b = " + AinB());
}
}