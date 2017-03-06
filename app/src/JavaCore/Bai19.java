package LamQuenJav;

import java.util.Scanner;

public class Bai19 {
	public static void main(String[] args){
		 Scanner input =new Scanner (System.in);
		 System.out.print("Nhap S : ");
		 int n= input.nextInt();
		 int tmp=0;
		 int dem =0;
		 for (int i=10000; i<=99999;i++){
			 for (int j=1;j<=i; j++) if (i%j==0) tmp++;
			 if (tmp==2){
				 if(tong(i)==n){
					 System.out.print(i+" ");
					 System.out.println();
					 dem++;
				 }
			 }
			 tmp=0;
		 	}
		 if (dem ==0) System.out.println("khong co so nguyen to 5 chu so va tong cac chu so = "+n);
		 }
   public static int tong(int a){
	   int[] mang = new int[100];
		 int j=1;
		 int b= a;
		 for (int i=10; i<=a; i=i){
			 mang[j]=a%i;
			 a=(a-mang[j])/i;
			 j++;
		 }
		 
		 
		 int tong=a;
		for (int k =1; k<j; k++){
			tong =tong+ mang[k]; 
	}	
	return tong;
}
    
}

