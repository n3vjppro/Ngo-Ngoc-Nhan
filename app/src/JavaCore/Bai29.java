package LamQuenJav;

import java.util.Scanner;

public class Bai29 {
	public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
		System.out.print("Nhap mang = ");
		String xau;		
		xau=input.nextLine();
		String[] A = xau.split(" ");
		String xau2="";
		String Max="";
		int vitriMax=0;
		for (int i =0; i < A.length -1; i++) {
			for (int j = 1; j < A.length; j++) {
				if (A[i].length()> A[j].length()) {
					Max = A[i];
					vitriMax =i;
				}
				else{
					Max =A[j];
					vitriMax=j;
				}
			}
		}
		System.out.println(" tu : '"+Max+"' o vi tri so: "+vitriMax+" La tu co nhieu ki tu nhat");
}}

