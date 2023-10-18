package not1;

import java.util.Scanner;




public class NotSistemi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("vize notunuz giriniz:");
		
		int vize = scan.nextInt();
		
		System.out.println("final notunuzu giriniz");
		int Final = scan.nextInt();
		
		 int ToplamOrtalama = (vize*40/100) + (Final*60/100);
		 
		 if (  ToplamOrtalama <100 ) {
			 System.out.println("dersi AA ile geçtiniz...");
		 }
		 else if ( ToplamOrtalama <=90 ) {
			 System.out.println("dersi BA ile geçtiniz...");
		 }
		 else if ( ToplamOrtalama <=80 ) {
			 System.out.println("dersi BB ile geçtiniz...");
		 }
		 else if ( ToplamOrtalama <=70 ) {
			 System.out.println("dersi CB ile geçtiniz...");
		 }
		 else if ( ToplamOrtalama <=60 ) {
			 System.out.println("dersi CC ile geçtiniz...");
		 }
		 else if ( ToplamOrtalama <=50 ) {
			 System.out.println("dersi DC ile geçtiniz...");
		 }
		 else {
			System.out.println("dersten kaldınız");
		}
	}
 
	
}
			
