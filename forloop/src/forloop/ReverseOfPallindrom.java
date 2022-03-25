package forloop;

import java.util.Scanner;

public  class ReverseOfPallindrom {
	 static void CheckPallindrom() {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n=s.nextInt();
		int d;
		int rev=0;
		while(n!=0) {
			d=n%10;
			rev=rev*10+d;
			n=n/10;
		}
		System.out.println("Reverse Number are: "+rev);
	}

	public static void main(String[] args) {
		
		ReverseOfPallindrom.CheckPallindrom();
	}

}
