//WAP to find the cube of a given number.
public class Cube {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the nos.:");
		int a = sc.nextInt();
		int b= a*a*a;
		System.out.print("Cube of this no is: "+ b);
		sc.close();
	}
}
