package tr.org.linux.kamp2016.helloworld;

import java.util.Scanner;

public class Fibonacci {
//	static int n1=0,n2=1,n3=0;    
//	 static void printFibonacci(int count){    
//	    if(count>0){    
//	         n3 = n1 + n2;    
//	         n1 = n2;    
//	         n2 = n3;    
//	         System.out.print(" "+n3);   
//	         printFibonacci(count-1);    
//	     }    
//	 }    
//	 public static void main(String args[]){    
//	  int count=10;    
//	  System.out.print(n1+" "+n2);//printing 0 and 1    
//	  printFibonacci(count-2);//n-2 because 2 numbers are already printed   
//	 }  
//	}  
	public static void main(String args[]){
		Scanner input= new Scanner(System.in);
		System.out.println("İlk kaç sayının fibonaccisini istiyorsun: ");
		int count=input.nextInt();
		int n1=0;
		int n2=1;
		int n3;
		System.out.println("0");
		System.out.println("1");
		for (int i =2; i<count;++i){
			n3= n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
		
	}
}
