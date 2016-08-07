package tr.org.linux.kamp2016.helloworld;

import java.util.Scanner;

public class PrimitiveCalculator {

	public static void main(String args []){
		
		Scanner input= new Scanner (System.in);
		
		boolean ctn= true;
		
		while(ctn){
			System.out.println("Bir sayı giriniz: ");
			double inputNumber1= input.nextDouble();
			
			System.out.println("Bir işlem giriniz: ");
			String inputFunction = input.next();
			
			double result =0;
			double inputNumber2=0;
			
			
			switch (inputFunction) {
			case "+":
				System.out.println("Bir sayı giriniz: ");
				inputNumber2= input.nextDouble();
				result= inputNumber1 +inputNumber2;
				System.out.println(inputNumber1+"+" +inputNumber2+ " = "+ result);
				break;
			case "-":
				System.out.println("Bir sayı giriniz: ");
				inputNumber2= input.nextDouble();
				result= inputNumber1 -inputNumber2;
				System.out.println(inputNumber1+"-" +inputNumber2+ " = " +result );
				break;
			case "*":
				System.out.println("Bir sayı giriniz: ");
		        inputNumber2 = input.nextDouble();
				result= inputNumber1*inputNumber2;
				System.out.println(inputNumber1+"*" +inputNumber2+ "=" +result );
				break;
			case "/":
				System.out.println("Bir sayı giriniz: ");
				inputNumber2= input.nextDouble();
				result= inputNumber1/inputNumber2;
				System.out.println(inputNumber1+"/" +inputNumber2+ " = "+result );
				break;
			case "=":
				System.out.println("Bir sayı giriniz: ");
				inputNumber2= input.nextDouble();
				result= inputNumber1=inputNumber2;
				System.out.println(inputNumber1+"=" +inputNumber2+ " = "+result);
				break;
			case "^":
				System.out.println("Bir sayı giriniz: ");
				inputNumber2= input.nextDouble();
				result= Math.pow(inputNumber1, inputNumber2);
				System.out.println(inputNumber1+"^" +inputNumber2+ " = "+result);
				break;
			case "hypot":
				System.out.println("Bir sayı giriniz: ");
				inputNumber2= input.nextDouble();
				result= Math.hypot(inputNumber1, inputNumber2);
				System.out.println("sqrt"+"("+inputNumber1+"²"+"+" +inputNumber2+"²"+")"+ " = "+result);
				break;
			case "cubeRoot":
				System.out.println("Bir sayı giriniz: ");
				result= Math.cbrt(inputNumber1);
				System.out.println(inputNumber1+" cube root "+" = "+result);
				break;
			default:
				
				System.out.println("Bu işlem geçersizdir");
				break;
			}
			System.out.println("Başka işlem yapmak istiyor musunuz?");
			String ctnString= input.next();
			if (ctnString.equals("H")){
				ctn = false;
			}
		}
	
	}
}
