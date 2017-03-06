package LamQuenJav;

import java.util.Scanner;

public class Bai20 {
	public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
		 System.out.print("Nhap n : ");
		 int n= input.nextInt();
		 for (int i = 0; i < n; i++) {
			 if (kiemtra(Fi(i))==1) {
				 if (Fi(i)<n ){
					 System.out.println(Fi(i)+" ");
					
				 }
			 }
			
		}
}
 
	public static int Fi(int n){
		if (n==0) return 0;
		if (n==1) return 1;
		else return Fi(n-1)+Fi(n-2);
		
	}
	public static int kiemtra(int n){
			 int tmp=0;
			 for (int j=1;j<=n; j++) if (n%j==0) tmp++;
			 if (tmp==2) return 1;
			 else return 0;
			 
	}
}
