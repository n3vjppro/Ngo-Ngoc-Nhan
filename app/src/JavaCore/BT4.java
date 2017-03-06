package BT4;

import java.util.Scanner;

public class BT4 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.print("Nhap so nguyen: ");
	int so = sc.nextInt();
	int i=2;
	System.out.print("So "+so+" duoc phan tich thanh: 1");
	do{
		if(so%i==0){
			so = so/i; 
			System.out.print(" x "+i);
		}else i++;
	}while(i<=so);
	}
}
