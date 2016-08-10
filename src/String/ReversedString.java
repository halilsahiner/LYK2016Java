package String;

import java.util.Scanner;

public class ReversedString {
	public static void main(String args[]){
		
		Scanner input= new Scanner(System.in);
		String reverse=input.nextLine();
		System.out.println(isPalingdrome(reverse));
		
	    
	    
	}
	public static boolean isPalingdrome(String str){
		boolean answer = false;
		String reverse="";
		for (int i=str.length()-1; i>=0; i--) {
	        reverse = reverse+ str.charAt(i);
	        
	}
		if(!reverse.equals(str)){
			return answer;
		}
		    
		else{
			answer=true;
			return answer;
		}
	
	}
}
