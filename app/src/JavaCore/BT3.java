package BT3;

import java.util.Scanner;



public class BT3 {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so nguyen: ");
		//int so = Integer.parseInt(sc.nextLine());
		String ch = sc.nextLine();
		int arso[] = new int[100];
		int tong = 0;
		for (int i = 0; i < ch.length(); i++) {
			String c = Character.toString(ch.charAt(i)); 
			arso[i] = Integer.parseInt(c);
			tong+= arso[i];
			
		}
		System.out.println("Tong cac chu so la: "+ tong);
	}
}
