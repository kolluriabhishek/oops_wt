import java.util.*;
public class exer1{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		double r=sc.nextDouble();
		double a;
		double p;

		if(r<0){
			System.out.println("enter Valid radius");
		}
		else{
			a=Math.PI * r *r;
			p=2 * Math.PI * r;

			System.out.println("perimiter:"+p);
			System.out.println("area" +a);
		}
		
	}
}