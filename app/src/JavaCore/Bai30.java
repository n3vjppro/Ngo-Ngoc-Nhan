package LamQuenJav;

import java.util.Scanner;

public class Bai30 {
	public static void main(String[] args) {
		 Scanner input =new Scanner (System.in);
		 System.out.print("Nhap mang = ");
		 String xau;		
		 xau=input.nextLine();
		 String[] A = xau.split(" ");
		 String xau2="";
		 for (String i : A) {
			if (!i.equals(" ")&&!i.equals("")) {
				xau2 = xau2 + i.toUpperCase().charAt(0)+i.substring(1).toLowerCase()+" " ;
			}
		}
		 A=xau2.split(" ");
		 System.out.print(A[A.length-1]+" ");
		 for (int i = 0; i < A.length-1; i++) {
			System.out.print(A[i]+" ");
		}
	}}
	