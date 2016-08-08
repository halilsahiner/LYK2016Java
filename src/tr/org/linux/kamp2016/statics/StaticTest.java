package tr.org.linux.kamp2016.statics;

public class StaticTest {
	public static void main(String args[]){
		StaticExample.testString="Hebele";
		StaticExample.setTestValue(5);
		System.out.println(StaticExample.getTestString());
		System.out.println("testValue= "+ StaticExample.getTestValue());

}
}
