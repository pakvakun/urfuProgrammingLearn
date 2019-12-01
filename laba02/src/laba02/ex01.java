package laba02;

import java.util.Scanner;


public class ex01 {
	
	
	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		
		System.out.println("Pls input int number");
		int InputNumber = In.nextInt();
		
		boolean div = (InputNumber % 3) == 0;
		
		if(div) {
			System.out.println("Число делится на 3");
		}else {
			System.out.println("Число не делится на 3");
		}
		
		In.close();

	}

}
