package BT1;

import java.util.Scanner;

public class BT1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so a:");
		int a = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap so b:");
		int b = Integer.parseInt(sc.nextLine());
		System.out.println("USCLN la "+USCLN(a,b));
		BCNN(a,b);
	}
	private static void BCNN(int a, int b) {
		int m = USCLN(a,b);
		System.out.println("BCNN la: "+(a*b)/m);
	}
	public static int USCLN(int a, int b) {
		
	do{
		if(a>b) a-=b;
		if(a<b) b-=a;
		
	}while(a!=b);
	return a;
	}
}
