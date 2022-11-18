package assignment16_11;

public class Objectcalling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Objectcalling a=new Objectcalling();
		a.multiply();
		a.multiply(5);
		a.multiply(6, 7);
		a.mutliply(8, 9, 10);

	}
	public void multiply() {
		System.out.println("first multiplication");
		
	}
	public void multiply(int a) {
		System.out.println("second multiplication is: "+a);
	}
	
	public void multiply(int a,int b) {
		int result=a*b;
		System.out.println("third multiplication is: "+result);
	}
	public void mutliply(int a, int b,int c) {
		int result=a*b*c;
		System.out.println("fourth mutliplication is: "+result);
	}

}
