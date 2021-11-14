package CoreJavaAssignments;


import java.util.Scanner;

public class SandCInterest {

	public static void main(String[] args) {
		double p,rate,t,simple,compound;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount");
		p=sc.nextDouble();
		System.out.println("Enter the number of years");
		t=sc.nextDouble();
		System.out.println("Enter the rate of interest");
		rate=sc.nextDouble();
		simple=(p*t*rate)/100;
		compound=p*Math.pow(1.0+rate/100.0,t)-p;
		System.out.println("Simple Interest="+simple);
		System.out.println("Compound Interest="+compound);
		

	}

}
