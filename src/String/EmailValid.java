package String;

import java.util.Scanner;

public class EmailValid {
	
	public static void main(String args[]){
	   
		System.out.println("This program takes an email adress as an");
		Scanner input= new Scanner (System.in);
		String mail = "mail";
		
		while(!mail.isEmpty()){
			System.out.println("Enter an email adress");
			mail=input.nextLine();
			if(!mail.isEmpty()){
				if(isValid(mail)){
					System.out.println("This mail is valid");
				}
				else{
					System.out.println("This mail adress is not valid.");
				}
			}
			System.out.println("Done");
			
		}
	   
	}	
	private static boolean isValid(String email){
		
		if(email.contains(" ")){
			return false;
			
		}
		if(!email.contains("@")){
			return false;
		}
		
		if(!email.contains(".")){
			return false;
			
		}
		if(email.startsWith("@") || email.startsWith(".")) {
			return false;
		}
		if(!(email.indexOf('@')+1<email.lastIndexOf('.'))){
			return false;
//		}
//		if(!(email.lastIndexOf('.')+2< GİTHUB A BAK
		
	}
		return true;

	}
	
	
}
