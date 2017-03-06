package LamQuenJav;

import java.util.Scanner;

public class Bai27 {
	public static void main(String[] args) {
		Scanner inp1 =new Scanner(System.in);		
		System.out.println("Nhap so phan tu cua mang : ");
		int n = inp1.nextInt();
		int[] A = new int[100];
		nhapso(A,n);
		int a=0;
		do {
			System.out.println("1. Tim phan tu lon thu nhat va thu 2 trong mang");
			System.out.println("2. Sap xep mang giam dan ");
			System.out.println("3. Them mot phan tu vao mang ");
			System.out.println("4. Thoat chuong trinh");
			System.out.println("Lua chon cua ban : ");
			a= inp1.nextInt();
			if (a>0||a<5) {
				switch (a){
				case 1:{
					sapxep(A,n);
					System.out.println("2 So lon nhat la: "+A[0]+", "+A[1]);
					break;
				}
				case 2: {
					sapxep(A,n);
					for (int i = 0; i < n; i++) {
						System.out.print(A[i]+", ");
					}
					System.out.println();
					break;
				}
				case 3:{ n=n+1;
					System.out.println("Nhap Phan tu : ");
					int tmp = inp1.nextInt();
					if (tmp>=0||tmp>=100) A[n]=tmp;
					while (tmp<0 || tmp>100){
						System.err.println("Vui long nhap so tu 0-100");
						tmp = inp1.nextInt();
						if (tmp>=0||tmp>=100) A[n]=tmp;
				}
					sapxep(A,n);
					for (int i = 0; i < n; i++) {
						System.out.print(A[i]+", ");}
					System.out.println();
					break;
					
				}
				}
					
			}
		} while (a!=4);
	}
	
	
	public static void nhapso(int[] A, int n) {
		Scanner inp =new Scanner(System.in);
		int tmp=0;
		for (int i = 0; i < n; i++) {
			System.out.print("nhap phan tu thu  "+(i+1)+" : ");
			tmp = inp.nextInt();
			if (tmp>=0||tmp>=100) A[i]=tmp;
			while (tmp<0 || tmp>100){
				System.err.print("Vui long nhap so tu 0-100");
				tmp = inp.nextInt();
				if (tmp>=0||tmp>=100) A[i]=tmp;
			}
		}
	}
	public static void sapxep (int[] a, int n) {
		int tmp;
		for (int i = 0; i < n - 1; i++) 
		    for (int j = i + 1; j < n; j++) 
		    { 
		     if (a[i] < a[j]) 
		       { 
		        tmp = a[i]; 
		        a[i] = a[j]; 
		        a[j] = tmp; 
		        } 
			
			
		}
		
	}
	

}
