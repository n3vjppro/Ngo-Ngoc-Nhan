package LamQuenJav;

public class Bai25 {
	public static void main(String[] args) {
		System.out.println("Cac so thoa man dieu kien :");
		System.out.println("1, la so nguyen to");
		System.out.println("2, la so thuan nghich");
		System.out.println("3, tong la mot so thuan nghich");
		System.out.println("la  :  ");
		for (int i = 100000; i <= 9999999; i++) {
			if (KiemTraSoNguyenTo(i)==true) {
				if (KTsoThuanNghich(i)==true){
					if (KTsoThuanNghich(tong(i))==true){
						System.out.println(i);
					}
				}
			}
		}
		System.out.println("Ket thuc");
		
	}
	public static boolean KTsoThuanNghich(int n){
		if (n==DaoSo(n)) return true;
		else return false;
	}
	
	public static boolean KiemTraSoNguyenTo(int n){
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
	}
	public static int tong (int a){int[] mang = new int[100];
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
