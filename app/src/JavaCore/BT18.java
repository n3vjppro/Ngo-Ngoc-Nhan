package BT18;

import java.util.Scanner;

public class BT18 {
	public static void main(String[] args) {
	 Scanner input =new Scanner (System.in);
	 System.out.print("Nhap mang = ");
	 String xau; 
	 xau=input.nextLine();
	 String[] mang =new String[xau.length()];
	 
	 for ( int j = 0; j< xau.length(); j++) {
	mang[j]=xau.substring(j,j+1);
	}

	 int demktr=1, demktu=1, stk;
	 for (int i = 0; i < xau.length(); i++) {
		 demktr=1;
	if (mang[i].equals(" ")) ;
	else{
		demktr--;	
	}
	if(i<xau.length()-1)
	if(mang[i].equals(" ")&&mang[i+1].equals(" ")) i++;
	
	if(demktr==1) demktu++;

	}
	if(mang[0].equals(" ") ) demktu--;
	if(mang[xau.length()-1].equals(" ")) demktu--;
	System.out.println("Xau co " +(demktu)+" tu"); 
}
}
