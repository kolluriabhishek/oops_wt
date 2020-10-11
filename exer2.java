import java.util.*;
public class exer2{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();

		int result;

		if(x>y && x>z)
		result=x;
		else if(y>x && y>z)
		result=y;
		else
		result=z;

	System.out.println(result);
}
}
