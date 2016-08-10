package tr.org.linux.kamp2016.generics;

import java.util.concurrent.SynchronousQueue;

public class GenericTest {
	public static void main(String args[]){
		GenericMethod newGenericMethod = new GenericMethod();
		
		Integer[] intArray = {1,2,3,4,5};
		Double[]  doubleArray ={1.2,3.2,4.5,5.6};
		String [] stringArray = {"h","o","r","s","e"};
		
		System.out.println("intArray elemanları: ");
		newGenericMethod.printArray(intArray);
		newGenericMethod.printArray(doubleArray);
		newGenericMethod.printArray(stringArray);
		
	}
}
