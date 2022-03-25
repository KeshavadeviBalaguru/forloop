package forloop;

import java.util.Scanner;

public class SumofReverse {
	void SumReverse()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=s.nextInt();
		int d;
		int sum=0;
		while(n!=0)
		{
			d=n%10;
			sum=sum+d;
			n=n/10;
		}
		System.out.println("Sum of Number: "+sum);
	}
      
      
	public static void main(String[] args) {
		SumofReverse sr=new SumofReverse();
		sr.SumReverse();
      
	}

}
