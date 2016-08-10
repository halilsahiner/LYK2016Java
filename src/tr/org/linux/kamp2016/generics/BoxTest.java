package tr.org.linux.kamp2016.generics;

public class BoxTest {
	
//	public static void main(String args[]){
//		
//		Box<Integer> integerBox = new Box<Integer>(); 
//		
//		integerBox.set( new Integer(10));
//		
//		Integer someInteger = integerBox.get();
//		
//		System.out.println(someInteger);
//		
//	}
//
//}
public static void main(String args[]){
	
	Box<String> stringBox = new Box<String>(); 
	
	stringBox.set( new String("hey"));
	
	String someString = stringBox.get();
	
	System.out.println(someString);
	
}

}

