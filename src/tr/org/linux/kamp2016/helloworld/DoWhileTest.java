package tr.org.linux.kamp2016.helloworld;

public class DoWhileTest {
	public static void main(String args[]){
		
		int counter = 1;
		do {
			System.out.println(counter); //do methodunu kullandığımızda önce methodun içindeki işlemi gerçekleştirip sonra işlemi devam ettiriyor
											// counter 'ı 100 yap gör
			++counter;
			
		}
		while(counter <= 10);
		
	}
}
