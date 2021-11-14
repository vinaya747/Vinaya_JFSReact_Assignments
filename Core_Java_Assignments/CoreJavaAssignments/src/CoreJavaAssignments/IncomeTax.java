package CoreJavaAssignments;

import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter the income");
		int income=sc.nextInt();
		if(income>=0&&income<=80000)
		{
			System.out.println("tax is nill");
		}
		else if(income>=181001&&income<=300000)
		{
			System.out.println("tax is 10%");
		}
		else if(income>=300001&&income<=500000)
		{
			System.out.println("tax is 20%");
		}
		else if(income>=500001&&income<=1000000)
		{
			System.out.println("tax is 30%");
		}
		
	}
}
