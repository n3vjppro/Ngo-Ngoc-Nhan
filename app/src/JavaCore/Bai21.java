package LamQuenJav;

import java.util.Scanner;

public class Bai21 {
	public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
		 System.out.print("Nhap n : ");
		 int n= input.nextInt();
		 System.out.println("tong n so tu nhien la : "+tong(n));
		 System.out.print("phan tich n = ");
		 phantich(n);
		 
		 
	
	}
	public static void phantich(int a){
		int b=a;
		 int[] mang = new int[100];
		 int j=1;
		 for (int i=2; i <=a; i++){
			 if (a%i==0) {
				 mang[j] = i;
				 a= a/i;
				 i--;
				 j++;
				 }
			 
		 }
		
		 for (int i=1; i <=j-2; i++) System.out.print(mang[i]+"x");
		 System.out.println(mang[j-1]+"= "+b);
	}
	public static int tong(int n){
		int ttong=0;
		for (int i=0;i<=n;i++) ttong=ttong +i;
		return ttong;
	}
}
