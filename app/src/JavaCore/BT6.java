package BT6;

import java.util.Scanner;

public class BT6 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.print("Nhap so nguyen: ");
	int so = sc.nextInt();
	int  dem, i;
	System.out.print("Cac so nguyen to nho hon "+so+" la : 1 ");
	for (i = 1; i < so; i++) { dem=0;
		for (int j = 1; j < i; j++) {
			if(i%j==0) dem+=1;
		}
		if(dem==1) System.out.print(i+" ");
	}
	
	}
}
