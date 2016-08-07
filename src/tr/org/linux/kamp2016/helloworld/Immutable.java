package tr.org.linux.kamp2016.helloworld;

public class Immutable {

	private final int value; //değişmez bir değişken olduğunu gösteriyor "final"
	
	public Immutable(int value){
		this.value=value;
	}

	public int getValue() {
		return value;
	}
	
}

