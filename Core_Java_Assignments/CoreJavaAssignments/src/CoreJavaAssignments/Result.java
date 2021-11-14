package CoreJavaAssignments;

import java.util.Scanner;

public class Result {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter m1 marks");
		int m1=sc.nextInt();
		System.out.println("Enter m2 marks");
		int m2=sc.nextInt();
		System.out.println("Enter m3 marks");
		int m3=sc.nextInt();
		if(m1>=60&&m2>=60&&m3>=60)
		{
			System.out.println("result is pass");
		}
		else if((m1>=60&&m2>=60)||(m2>=60&&m3>=60)||(m1>=60&&m3>=60))
		{
			System.out.println("promooted");
		}
		else
		{
			System.out.println("fail");
		}
		

	}

}



