import java.util.Scanner;
public class exer4{

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int result = 0;
	int temp = n;
	int cubeSum = 0;

	while (temp != 0) {
	cubeSum += Math.pow(temp % 10, 3);
	temp /= 10;
	}
	
	if (cubeSum == n) {
	System.out.println(1);
	}
	else {
		System.out.println(0);
	}
}
}