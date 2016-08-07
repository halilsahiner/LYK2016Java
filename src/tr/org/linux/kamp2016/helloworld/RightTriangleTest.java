package tr.org.linux.kamp2016.helloworld;

import java.util.Random;

public class RightTriangleTest {

	public static void main(String args[]) {
		for (int i = 0; i < 10; i++) {
			int a = randInt1(1, 50);
			int b = randInt1(1, 50);
			RightTriangle r = new RightTriangle(a, b);
			System.out.println((1 + i) +"-"+ r); //toString için sadece r yi çağırmak yetiyor burada

		}

//		for (int i=0; i<10; i++){
//			int a = randInt1(1,100);
//			int b= randInt1(1,100);
//			RightTriangle r = new RightTriangle(a, b);
//			System.out.println();
//		}
	}

	public static int randInt1(int min, int max) {
		Random rgen = new Random();
		int range = Math.abs(max - min) + 1;
		int random = min + rgen.nextInt(range);
		return random;

	}
}