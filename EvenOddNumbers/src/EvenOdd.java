public class EvenOdd {
	public static int EONum(int n){
		int i=1,sum1=0,sum2=0;
		while(i<=n)
		{
			if(i%2==0)
		{
			sum1=sum1+1;
		}
		else
		{
			sum2=sum2+1;
		}
			i=i+1;
		}
		return sum2;
	}
public static void main(String[]args)
{
	int n=7;
	int sum=EONum(n);
	System.out.println(sum);
}
}
