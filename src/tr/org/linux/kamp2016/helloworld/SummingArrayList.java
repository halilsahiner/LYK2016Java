package tr.org.linux.kamp2016.helloworld;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SummingArrayList {

	public static void main(String args[]) {

		
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		while (true) {
			System.out.println("Enter a number to sum/0 to quit: ");
			int i = input.nextInt();
			if (i == 0)
				break;
			arrayList.add(i);
		}
		System.out.println("Sum: " + sumArrayList(arrayList));
	}

	public static int sumArrayList(ArrayList<Integer> arrayList) {
		int sum = 0;
		for (Integer i : arrayList) {
			sum += i;
		}
		return sum;
	}
}
// Scanner numbers= new Scanner(System.in);
// int number1=numbers.nextInt();
// ArrayList <Integer>sumArray =new ArrayList<Integer>();
//
// while (true){
//
// if (number1==0){
// break;
//
// }
// for(int i=0;i<sumArray.size();i++){
// System.out.println("Int gir");
//
// sumArray.add(number1);
// number1+=sumArray.get(i);
// number
// break;
//
// }
//
// }
// System.out.println("sum: "+sumArray);
// }
