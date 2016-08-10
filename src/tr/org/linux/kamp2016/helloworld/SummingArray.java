package tr.org.linux.kamp2016.helloworld;

import java.util.Scanner;

public class SummingArray {
	 
		 public static void main(String args []){
			 System.out.println("array in uzunluğunu belirleyiniz");
			 Scanner input= new Scanner(System.in);
			 int size =input.nextInt();
			 int[] sumArray= new int[size];
			 int sum=0;
			 for(int i=0;i<sumArray.length;i++){
				 System.out.println("Int gir");
				 Scanner inputNumber= new Scanner(System.in);
				 int number1=inputNumber.nextInt();
//				 sumArray[i]=number1;
				 sum+=sumArray[i];
				 break;
				 
			 }
			 
				 System.out.println("array'in elemanlarının toplamı: "+sum);
				 
		 }
		 	
	 
}

