package tr.org.linux.kamp2016.helloworld;

public class MutableTest {
	public static void main (String args[]){
		
		Mutable mut=new Mutable (30);
		Immutable immut =new Immutable (55); // burada sadece immut'u Immutable objeyi referans ederek çekiyor
		System.out.println(mut.getValue());
		mut.setValue(20);
		
		System.out.println(mut.getValue());
		immut = new Immutable(11); // burada ise referansın objesini değiştiriyoruz
		System.out.println(immut.getValue());
	}
}
