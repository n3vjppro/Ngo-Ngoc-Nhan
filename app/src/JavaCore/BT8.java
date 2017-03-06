package BT8;


import java.util.Scanner;

public class BT8 {
	public static void main(String[] args) {
		
	int stn[] = new int[6];
	for (int i = 100; i <= 999; i++) {
		String so = String.valueOf(i);
		System.out.print("\n"+so);
		for (int j = so.length()-1; j >-1; j--) {
			System.out.print(so.charAt(j));
		
		}
		
	}
	}
}
