package LamQuenJav;

import java.util.Scanner;

public class Bai18 {
	public static void main(String[] args){
		 Scanner input =new Scanner (System.in);
		 System.out.print("Nhap mang = ");
		 String xau;		
		 xau=input.nextLine();
		 String[] mang =new String[xau.length()];
		 
		 for ( int j = 0; j< xau.length(); j++) {
				mang[j]=xau.substring(j,j+1);
			}
		 
		
		 int dem=1;
		 for (int i = kiemtra(0,mang,0); i < mang.length; i++) {
				if (mang [i].equals(" ")){
					dem=dem+1;
					i=i+kiemtra(0,mang,i);
				}
		}
		System.out.println("Xau co " +dem+" tu");	 
}
	public static int kiemtra(int k, String[] mang,int c) { 
		for (int i = c; i < mang.length; i++) {
			if (mang [i].equals(" ")) k++;
			else break;
			}
		 return k;
}}