package LamQuenJav;

import java.util.Scanner;

public class Bai24 {
		public static void main(String[] args) {
			Scanner input =new Scanner (System.in);
			System.out.println("Nhap 1 : liet ke cac so nguyen to co 5-7 chu so ");
			System.out.println("Nhap 2 : liet ke cac thuan nghich co 5-7 chu so ");
			System.out.println("Nhap 3 : liet ke cac moi chu so la so nguyen to co 5-7 chu so ");
			System.out.println("Lua chon : ");
			int a= input.nextInt();
			
			switch (a) {
			case 1:
				int tmp=0;
				System.out.println("So nguyen to tu 5-7 chu so");
				for (int i=10000; i<=9999999;i++){
					for (int j=1;j<=i; j++) if (i%j==0) tmp++;
						if (tmp==2){
							System.out.println(i);
							}
						tmp=0;
						}
				System.out.print("Ket thuc");
				break;
				
			case 2: 
				System.out.println("so thuan ngich");
					for(int i=10000; i<=9999999;i++){
						if(i==DaoSo(i)) System.out.println(i+" ") ;
					
				 }
					System.out.print("Ket thuc");
				 break;
			case 3: 
				for(int i=10000; i<=9999999;i++){
					if(ktSonguyento(i)==true) System.out.println(i+" ") ;
			}}
				}
			
		
		public static boolean ktSonguyento(int n){
			while(n!=0){
				if(!Kiemtra(n%10)) return false;
				n/= 10;
			}
			return true;
		}
		public static boolean Kiemtra(int n){
			if(n>1){
			for(int i=2;i<=Math.sqrt(n);i++){
				if(n%i==0) return false;
			}
			return true;
		}
			else return false;
		}
		static int DaoSo(int n)
		{
		int k=0;
		 while (n!=0)
		 {
		 k=k*10+(n%10);
		 n/=10;
		 }
		 return k;
		}}	 
				 
				 



