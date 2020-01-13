package laba02;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		
		tryAgain:
		while(true) {
			System.out.println("Pls input number");
			int var = In.nextInt();
			int mod5 = var % 5;
			int mod7 = var % 7;
			
			if(mod5 == 2 && mod7 == 1) {
				System.out.println("all right " );
				break;
			}else {
				System.out.println("try again ");
				continue tryAgain;
			}
		}
		In.close();
	}

}
