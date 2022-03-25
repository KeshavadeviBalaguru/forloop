package forloop;

import java.util.Scanner;

public class NeonNumber {
	void neon()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=s.nextInt();
		int d,sum=0,a=n*n;//81;
		while(a!=0)
		{
			 
			d=a%10;//1
			sum=sum+d;//0+1
			a=a/10;//8
			
		}
		System.out.println("Sum of the number is: "+sum);
		if(sum==n)
		{
			System.out.println("Is a Neon Number");
			
		}
		else
		{
			System.out.println("Not a Neon number");
		}
	}

	public static void main(String[] args) {
		NeonNumber nm=new NeonNumber();
		nm.neon();
	}

}
