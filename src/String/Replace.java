package String;

public class Replace {
	public static void main(String args[]) {
	
		String str = "Grapon Kağıtları";
		
		System.out.println(str.replace("Gr","Ka"));
		System.out.println(str.replaceFirst("a", "First"));
		System.out.println(str.replaceAll("a", "Hep"));
	
	}
}
