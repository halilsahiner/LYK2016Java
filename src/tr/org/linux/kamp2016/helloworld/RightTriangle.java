package tr.org.linux.kamp2016.helloworld;

public class RightTriangle {
     private int A=1;
     private int B=1;
     
     public RightTriangle(int A,int B){
    	this.A=A;
    	this.B=B;
     }
     
     public double hypotenus(){
    	
    	 return (int)Math.hypot( A, B);
     }
     public double perimeter(){
    	 
    	 
    	 return hypotenus()+A+B;
     }
     
     public double area(){
    	 return A*B/2;
    	
     }
    	
	public int getA() {
		
		return A;
	}

	public void setA(int a) {
		A = a;
	}

	public int getB() {
		return B;
	}

	public void setB(int b) {
		B = b;
	}
	@Override
	public String toString(){
		return  " A:" + this.getA() + " B: " + this.getB() + " area: " + this.area() +
				" perimeter: "+ this.perimeter() + " hypotenus " + this.hypotenus();
	}
}
