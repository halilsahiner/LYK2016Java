package tr.org.linux.kamp2016.helloworld;

import java.util.Scanner;

public class AccountTest {
	public static void main(String args[]) { //static sınıf içerisinde run edeceğimiz şeyler için gerekli

		Account account1 = new Account("Ali Veli", 50.00);

		System.out.println(account1.getName() + "" + "'nin bakiyesi: " + account1.getBalance());

		Scanner input = new Scanner(System.in);
		// ctrl+shift+o yaptığında kodu import ediyor
		System.out.println("Yatırmak istediğiniz miktarı girin");

		double depositAmount = input.nextDouble();
		//double method'u bize virgülden sonrasını da girebilmemizi sağlıyor
		System.out.println(depositAmount + " TL " + account1.getName() + " kişisininhesabına ekleniyor...");
		account1.deposit(depositAmount);

		System.out.println(account1.getName() + "" + "'nin bakiyesi: " + account1.getBalance());
	}
}
