package laba02;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		
		System.out.println("Pls input number");
		
		int InputNumber = In.nextInt();
		
		boolean gap = InputNumber >= 5 && InputNumber <= 10;
		
		if(gap) {
			System.out.println("число входит в диапазон!!!");
		}else {
			System.out.println("число не входит в диапазон");
		}
		
		In.close();

	}

}
