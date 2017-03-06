package BT7;

import java.util.Scanner;

public class BT7 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.print("Nhap n: ");
	int so = sc.nextInt();
	System.out.println("So Fibonacci thu n la: ");
	int f[] = new int[so];
	f[0] =1 ;
	f[1] =1 ; 
	
	for (int k = 2; k < so; k++) {
		f[k] = f[k-1]+f[k-2];
	}
	System.out.print(f[so-1]);
	}
}
