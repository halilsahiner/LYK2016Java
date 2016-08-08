package tr.org.linux.kamp2016.helloworld;



public class Factorial {
	
	public static int factorial(int x){
		int fact =1;
		for(int i =2; i<=x; i++)
			fact *=i;
		return fact;
	}

}
