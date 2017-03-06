package LamQuenJav;

import java.util.Scanner;

public class Bai16 {
	public static void main(String[] args){
		 Scanner input =new Scanner (System.in);
		 System.out.print("Nhap so phan tu cua mang n = ");
		 int n= input.nextInt();
		 float[] mang = new float[n];
		 for(int i=0; i<n;i++){
			 System.out.print("Nhap phan tu thu "+i+" : ");
			 mang[i]=input.nextFloat();
			 
		 }
		 int dem=0;
		 for (int i=0; i<n;i++){
			 if (mang[i]!=0) {
				 for (int j=0; j<n; j++){
					 if (mang[j]==mang[i]) dem=dem+1;
				 }
					 System.out.println(mang[i]+" xuat hien "+dem+" lan");
					 float a= mang[i];
					 for (int k=0; k<n; k++) if (mang[k]==a) mang[k]=0;
				 
				 dem=0;
			 }}
		 }
}
