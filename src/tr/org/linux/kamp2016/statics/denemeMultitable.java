package tr.org.linux.kamp2016.statics;

import java.util.Scanner;

public class denemeMultitable {

	public static void main(String args[]) {

		System.out.print("Enter size of multidımensiol array: ");
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		
		arrayToPrint(initializeMultiplicationTable(size));

	}

	public static int[][] initializeMultiplicationTable(int size) {

		int[][] matrices = new int[size][size];
		for (int r = 0; r <matrices.length; r++) {
			for (int c = 0; c < matrices[r].length; c++) {
				matrices[r][c] = (r + 1) * (c + 1);

			}
		}

		return matrices;
	}

	public static void arrayToPrint(int[][] matrices) {

		for (int r = 0; r < matrices.length; r++) {
			for (int c = 0; c < matrices[r].length; c++) {
				System.out.printf("%-3d ", matrices[r][c]);
			}
			System.out.println();
		}

	}
}
