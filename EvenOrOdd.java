package Day7hw;

import java.util.Scanner;

public class EvenOrOdd {
	public static int Sum(int no) {
		 int evenSum = 0;  
	        if(no%2==0) {
	        	System.out.println("Even no "+no);
	        }else {
	        	System.out.println("Odd no "+no);
	        }
	        return no;
}
	public static void main(String[] args) {
		System.out.println(Sum(45));
	}
}