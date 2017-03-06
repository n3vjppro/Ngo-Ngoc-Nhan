package BT2;

import java.util.Scanner;

public class BT2 {
	public static void doiCoSo(int n,int base){
		//Hàm này copy trên mạng
        if(n>=base) doiCoSo(n / base, base);
        if(n % base>9) System.out.printf("%c",n%base+55);
        else
        System.out.print((n % base));
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		int n = Integer.parseInt(sc.nextLine());
		System.out.println("Nhap co so can chuyen: ");
		int cs = Integer.parseInt(sc.nextLine());
		doiCoSo(n, cs);
	}
}
