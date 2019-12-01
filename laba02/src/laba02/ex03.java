package laba02;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		
		tryAgain:
		while(true) {
			System.out.println("Pls input number");
			int var = In.nextInt();
			int mod4 = var % 4;
			boolean isMore10 = var > 10;
			
			if(mod4 == 0 && isMore10) {
				System.out.println("all right!!!" );
				break;
			}else {
				if(!isMore10) {
					System.out.println("Число меньше 10");
				}else {
					System.out.println("Число не делится на 4");
				}
				continue tryAgain;
			}
		}
		In.close();
	}

}
