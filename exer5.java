import java.util.Scanner;
public class exer5{

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double mark_avg = 0d;
	int result;
	int s;
	// define size of array
	s = sc.nextInt();
	// The array is defined "arr" and inserted marks into it of integer type
	int[] arr = new int[s];
	for (int j = 0; j < arr.length; j++) {
	arr[j] = sc.nextInt();
	}
	// get the maximum element in the array
	result = arr[0];
	for (int i : arr) {
		if (i > result) {
			result = i;		
			}
	mark_avg += i;
	}
// calculate the averge marks
	mark_avg /= arr.length;
	System.out.println(result); // highest marks
	System.out.println(mark_avg); // average marks
}
}