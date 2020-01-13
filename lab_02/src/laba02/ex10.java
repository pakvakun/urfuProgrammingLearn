package laba02;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		
		System.out.println("Pls input number");
		
		int InputNumber = In.nextInt();
		
		String inputNumber8 = Integer.toString(InputNumber, 8);
		
		System.out.println("this is second right simbol in 8 SS (integer) - " + Integer.decode(inputNumber8) / 10 % 10);
		
		In.close();

	}

}
