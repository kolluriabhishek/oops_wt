import java.util.*;
public class exer3
{
	public static void main(String[] args)
	 {
		Scanner sc =new Scanner(System.in);

		System.out.println("enter value of n");

		int n =sc.nextInt();
		int i,sum,j;
		sum=0;
		for(i=0,j=0;i<n;i++,j+=2)
		{
			if(j%3==0)
				sum+=j;
		}

		System.out.println("the sum of first " +n+ "even numbers divisible by 3 is"+sum);
	}
}