package tr.org.linux.kamp2016.helloworld;

import java.util.Random;

public class Dice {
	private int faceValue1;
	private int faceValue2;

	public Dice() {
		this.faceValue1 = 1;
		this.faceValue2 = 1;

	}

	public int roll() {

		return Math.max(faceValue1, faceValue2);
	}

	public int getFaceValue1() {
		return faceValue1;
	}

	public void setFaceValue1(int faceValue1) {
		this.faceValue1 = faceValue1;
	}

	public int getFaceValue2() {
		return faceValue2;
	}

	public void setFaceValue2(int faceValue2) {
		this.faceValue2 = faceValue2;
	}

}
