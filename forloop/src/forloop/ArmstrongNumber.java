package forloop;

import java.util.Scanner;

public class ArmstrongNumber {
	void armstrong()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=s.nextInt();
		int n1=n;
		int d,sum=0,a=3;
		while(n!=0)
		{
			d=n%10;
			sum=sum+(int)(Math.pow(d, a));
			n=n/10;
		}
		System.out.println("The value is: "+sum);
	
	if(n1==sum)
	{
		System.out.println("Is a Armstrong Number");
	}
	else
	{
		System.out.println("Not a Armstrong Number");
	}
	}
	public static void main(String[] args) {
		ArmstrongNumber an=new ArmstrongNumber();
		an.armstrong();
	}

}
