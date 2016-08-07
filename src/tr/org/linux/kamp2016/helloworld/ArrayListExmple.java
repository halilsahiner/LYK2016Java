package tr.org.linux.kamp2016.helloworld;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListExmple {
	
		
			public static void main(String args[]){
		
				Scanner input = new Scanner (System.in);
				System.out.println("Bir değer giriniz");
				int inputNumber = input.nextInt();
				ArrayList <Integer>arraylist5 =new ArrayList<>();
				
				int counter =0;
				while (inputNumber !=-1){
					System.out.println("Bir giriniz");
					
					if(inputNumber != -1){
					arraylist5.add(inputNumber = input.nextInt());
					}
					inputNumber = input.nextInt();
					counter++;
					
				}
				for (int i = 0; i < arraylist5.size();i++){
					System.out.println("Arrayin"+i+". elmanı: "+ arraylist5.get(i) );
				}
				
			}

			
}
		




