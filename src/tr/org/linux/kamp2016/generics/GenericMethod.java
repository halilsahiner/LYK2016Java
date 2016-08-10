package tr.org.linux.kamp2016.generics;

public class GenericMethod {
	
	public static<E> void printArray(E[] inputArray){
		
		for(E element : inputArray){ // a : b anlamı a b'nin elemanıdır demek
			System.out.println(element);
		}
		
	}
}
