package tr.org.linux.kamp2016.helloworld;

import java.util.Scanner;

public class Array2 {
	
		public static void main(String args[]){
	
			Scanner input = new Scanner (System.in);
			System.out.println("Bir değer giriniz");
			String inputString = input.next();
			String[] array5 = new String [3];
			int counter =0;
			while (!inputString.equals ("çıkış")){
				System.out.println("Bir değer giriniz");
				
				if(!inputString.equals("çıkış")){
				 array5[counter]= inputString;
				}
				
				inputString = input.next();
				
				counter++;
				
			}
			for (int i = 0; i < array5.length;i++){
				System.out.println("Arrayin "+i+". elmanı: "+ array5[i]);
			}
			
		}
	}


