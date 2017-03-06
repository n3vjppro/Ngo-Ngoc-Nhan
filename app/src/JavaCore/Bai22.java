package LamQuenJav;

import java.util.Scanner;

public class Bai22 {
	public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
		 System.out.print("Nhap n : ");
		 int n=input.nextInt();
		 int dem=0;
		 int i = 1;
		while(i<=n){
			 if(n%i==0){
				 System.out.print(i+", ");
				 dem++;
			 }
			 i++;
		 }
		 if (dem==0) System.out.println(n+" k co uoc so");
		 else System.out.println("la uoc so cua n");
		 
		 i=1;
		 dem=0;
		 while(i<=n){
			 if(n%i==0){
				if(kiemtra(i)==1){
					System.out.print(i+", ");
					dem++;
				}
				 
			 }
			 i++;
		 }
		 if (dem==0) System.out.println(n+" k co uoc so nguyn to");
		 else System.out.println("la uoc so nguyn to cua n");
}
	public static int kiemtra(int n){
		 int tmp=0;
		 for (int j=1;j<=n; j++) if (n%j==0) tmp++;
		 if (tmp==2) return 1;
		 else return 0;
		 
}
}
