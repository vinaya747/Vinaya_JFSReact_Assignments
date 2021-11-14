package CoreJavaAssignments;

import java.util.Scanner;

public class Amstrong1 {

	public static void main(String[] args) {
		
		for(int num=100;num<=999;num++)
		{
		int temp=num;
		int len=0;
		while(temp!=0)
		{
			len=len+1;
			temp=temp/10;
		}
		int temp2=num;
		int a=0;
		while(temp2!=0)
		{
			int mul=1;
			int rem=temp2%10;
			for(int i=1;i<=len;i++)
			{
				mul=mul*rem;
				
			}
			a=a+mul;
			temp2=temp2/10;
		}
		if(a==num)
		{
			System.out.println(num);
		}
		
	}
	}
    }


