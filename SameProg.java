package Day7hw;

public class SameProg {

	public static int Add() {
		int a=25;
		int b=45;
		return a+b;	
	}
	public static int Sub() {
		int a=25;
		int b=45;
		return a-b;
	}
	public static int Mul() {
		int a=25;
		int b=45;
		return a*b;
	}
	public static int Div() {
		int a=25;
		int b=45;
		return a/b;
	}
	public static void main(String[] args) {
		System.out.println("add"+Add());
		System.out.println("sub"+Sub());
		System.out.println("mul"+Mul());
		System.out.println("Div"+Div());
	}
}
