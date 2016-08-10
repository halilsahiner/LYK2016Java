package tr.org.linux.kamp2016.generics;

public class Box <T> { //sınıf tarafında T tipinde bir veri tip var
	
	private T t; // t şeklinde bir değişken ürettik
	
//	public Box(T t){
//		this.t=t;
//	}
	public void set(T t){
		this.t=t;
	}
	public T get(){
		return t;
	}
	

}
