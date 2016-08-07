package tr.org.linux.kamp2016.helloworld;

import java.util.Scanner;

public class Array {
	public static void main(String args[]){
//		int a =1;
//		int b =2;
//		int c= 3;
//		int total = a+b+c;
//		
//		int [] array = new int [3];// array sayısını belirleyip aşağıda belirliyoruz
//		array[0]= a;
//		array[1]= b;
//		array[2]= c;
//		int total2 = array[1]+ array[2]+ array[0];
//		System.out.println("total: "+total );
//		System.out.println("total2: "+ total2);
//		
//		int [] array2 = new int [] {1,5,6}; // direk array'leri belirliyoruz aynı line'da
//		int total3 = array2[0]+array[1]+array[2];
//		System.out.println("total3: "+ total3);
//	    
//		int total4 = 0;
//		for (int i = 0; i < array.lenght;i++) {
//			total4 = total4 +array[i];
//		}
//		System.out.println("total4: "+ total4);	
		Scanner input = new Scanner (System.in);
		System.out.println("Bir değer giriniz");
		int inputNumber = input.nextInt();
		int[] array5 = new int [10];
		int counter =0;
		while (inputNumber !=-1){
			System.out.println("Bir değer giriniz");
			
			if(inputNumber != -1){
			array5[counter]= inputNumber;
			}
			inputNumber = input.nextInt();
			counter++;
			
		}
		for (int i = 0; i < array5.length;i++){
			System.out.println("Arrayin"+i+". elmanı: "+ array5[i]);
		}
		
	}
}
