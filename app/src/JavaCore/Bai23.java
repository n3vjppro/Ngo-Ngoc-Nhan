package LamQuenJav;

import java.util.Scanner;

public class Bai23 {
	public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
		System.out.print("Nhap n : ");
		int n= input.nextInt();
		System.out.println("So nguyen to >n : ");
		inSoNT(n);
		System.out.println("So Fibonaci >n : ");
		 for (int i = 0; i < n; i++) {
				 if (Fi(i)<n ){
					 System.out.println(Fi(i)+" ");
				 }
			 }
			 
		 
}
	public static void inSoNT(int n){	
		int tmp=0;
		 for (int i=2; i<n;i++){
			 for (int j=1;j<=i; j++) if (i%j==0) tmp++;
			 if (tmp==2){
				 System.out.print(i+" ");
				 System.out.println();
			 }
			 tmp=0;
		 	}
}
	public static int Fi(int n){
		if (n==0) return 0;
		if (n==1) return 1;
		else return Fi(n-1)+Fi(n-2);
		
	}
	}
