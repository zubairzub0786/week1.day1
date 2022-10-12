package week1.day2;

public class calculator {
	public void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	public void sub(int e,int f) {
        int c=e-f;
        System.out.println(c);
}
	public void multiply(int i,int j) {
		int c=i*j;
		System.out.println(c);
	}
	public void division(int x,int y) {
		int c=x/y;
		System.out.println(c);
	}
public static void main(String[] args) {
	calculator clc=new calculator();
	clc.add(100,200);
	clc.sub(30,60);
	clc.multiply(30, 8);
	clc.division(4, 60);
	
}
}