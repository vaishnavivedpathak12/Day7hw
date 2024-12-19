package Day7hw;
import java.util.*;
public class GrossSalary {
	public static int salary() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Salary");
	int bs=sc.nextInt();
	int gs=0;
	if(bs>=30000) {
		int total=bs*20/100;
		gs=bs-total;
		System.out.println("salary grather than 30000 get 20% bonus=" + gs);
	}
	else if(bs>=25000) {
		int total=bs*15/100;
		gs=bs-total;
		System.out.println("salary grather than 30000 get 15% bonus=" + gs);

		
	}
	else if(bs>=20000) {
		int total=bs*10/100;
		gs=bs-total;
		System.out.println("salary grather than 30000 get 10% bonus=" + gs);

	}
	else if(bs>=15000) {
	int total=bs*5/100;
	gs=bs-total;
	System.out.println("salary grather than 30000 get 5% bonus=" + gs);

		}
	else {
		System.out.println("Salary is negative");
	}
		return gs;
}
public static void main(String[] args) {
	System.out.println(salary());
}
}

	

