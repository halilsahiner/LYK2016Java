package hashMaps;

import java.util.HashMap;
import java.util.Scanner;

public class StatisticsWithHashMaps {

	 public static void main(String args[]){
		 
		 Scanner input= new Scanner (System.in);
		 HashMap <Integer,Integer> table = new HashMap <Integer,Integer>();
		 System.out.println("Please enter student number: ");
		 int size =input.nextInt();
		 generateRandomValues(table,size);
		 printTable(table);
		 System.out.println("mean = "+ mean(table));
	 }
	 
	 public  static void generateRandomValues(HashMap<Integer,Integer>map,int size){
			
			
			for (int i=0;i<size;i++){
				int random= RandomTest.randomIntegerRandom(0, 100);
				map.put(i+1, random);
				 
			}
		 
	 }
	 public static double mean (HashMap<Integer,Integer> map){
		 double answer =0;
		 double sum = 0;
		 for(Integer i: map.keySet()){
			 sum +=map.get(i);
		 }
//		 for(Integer value: map.values()){
//			 sum+= value;                        bu da güzel bir örnek
//		 }
		 answer=sum/map.size();
		 return answer;
		 
	 }
	 public static void printTable(HashMap<Integer,Integer>map){
		 for(Integer i: map.keySet()){
			 System.out.println("Student#"+i+" score:"+map.get(i));
			   
		 }
	 }
	
	
}
