package forloop;

public class SumofSeries {

	public static void main(String[] args) {
		float s=0;
		for(int i=2;i<=10;i++)
		{
			s=s+(float)1/i;
		}
       System.out.println("Sum= "+s);
	}

}
