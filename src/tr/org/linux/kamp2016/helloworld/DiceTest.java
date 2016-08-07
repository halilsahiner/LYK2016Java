package tr.org.linux.kamp2016.helloworld;

import java.util.Random;

public class DiceTest {

	public static void main(String args[]) {

		for (int i = 0; i < 3; i++) {

			Dice r = new Dice();
			r.setFaceValue1(randInt1(0, 7));
			r.setFaceValue2(randInt1(0, 7));

			if (r.getFaceValue1() < r.getFaceValue2()) {
				System.out.println(" First player: " + r.getFaceValue1() + " Second Player: " + r.getFaceValue2()
						+ " Result: " + r.roll() + " *Second Player Won*");

			} else if (r.getFaceValue1() > r.getFaceValue2()) {
				System.out.println(" First player: " + r.getFaceValue1() + " Second Player: " + r.getFaceValue2()
						+ " Result: " + r.roll() + " *First Player Won*");

			} else {
				System.out.println(" First player: " + r.getFaceValue1() + " Second Player: " + r.getFaceValue2()
						+ " Result: " + r.roll() + " Try Again...");
			}
		}

	}

	public static int randInt1(int min, int max) {
		Random rgen = new Random();
		int range = Math.abs(max - min) + 1;
		int random = min + rgen.nextInt(range);
		return random;
	}
}
