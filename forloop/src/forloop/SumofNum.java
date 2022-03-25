package forloop;

public class SumofNum {
	

	public static void main(String[] args) {
	int n=0;
	int Ans=0;
	
	for(int i=0;i<=10;i++)
	{
		
	if(i%2==0)
		{
			 Ans=Ans-i;
		}
	else
	{
		Ans=Ans+i;
	}
	}
	System.out.println("Answer is "+Ans);
	}

}
