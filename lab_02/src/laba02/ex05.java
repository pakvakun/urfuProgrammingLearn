package laba02;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		Scanner In = new Scanner(System.in);
		
		System.out.println("Pls input number");
		
		int InputNumber = In.nextInt();
		
		int thousands = InputNumber / 1000;
		String str;
		switch(thousands % 10) {
		case 1:
			str = "тысяча";
			break;
		case 2:
		case 3:
		case 4:
			str = "тысячи";
			break;
		default:
			str = "тысяч";
		}
		switch(thousands) {
			case 11:
			case 12:
			case 13:
			case 14:
				str = "тысяч";
				break;
			}
		System.out.println("во введенном числе " + thousands + " " + str);
		
		In.close();
	}

}
