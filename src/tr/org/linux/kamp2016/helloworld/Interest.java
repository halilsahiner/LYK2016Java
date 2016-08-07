package tr.org.linux.kamp2016.helloworld;

public class Interest {
	public static void main(String args[]){
		double amount;
		double principal=1000.0;
		double rate =0.05;
																//%n yeni line a geç demek
		System.out.printf("%s %20s %n","Yıl:", "Faizli para: "); // %s stringlerini basamak olarak kaydırmak için
		
		for (int year = 1; year <=10; ++year){						
			
			amount = principal * Math.pow(1.0 + rate, year);
			System.out.printf("%4d%, 20.2f%n", year, amount); // .5f bize virgülden sonra kaç değer göstereceğini belirtiyor
			// d değer 
			// % basamak değerini kaydırmak için gereken
		}
		
	}
}
