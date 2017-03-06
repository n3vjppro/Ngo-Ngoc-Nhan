package BT14;


import java.util.Scanner;

public class BT14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n: ");
		int n = Integer.parseInt(sc.nextLine());
		float arM[] = new float[n];
		for (int i = 0; i < arM.length; i++) {
			System.out.print("a"+i+": ");
			arM[i] = Integer.parseInt(sc.nextLine());
			}
		System.out.println("Cac phan tu xuat hien dung 1 lan la: ");
		int dem=0;
		for (int i = 0; i < arM.length; i++) {			
			dem =0;
			for (int j = 0; j < arM.length; j++) {
				if(arM[i]==arM[j])
				dem++;	
			}
			if(dem==1) System.out.println(arM[i]);
			
		}
	}
}
