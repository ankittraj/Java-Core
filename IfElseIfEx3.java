public class IfElseIfEx3 {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
		System.out.print("Enter the value of a: ");
		int a = sc.nextInt();
		System.out.print("Enter the value of b: ");
		int b = sc.nextInt();
		/*
		 *  System.out.println("Enter the value of c"); int c =
		 * sc.nextInt(); System.out.println("Enter the value of d"); int d =
		 * sc.nextInt(); System.out.println("Enter the value of e"); int e =
		 * sc.nextInt(); System.out.println("Enter the value of f"); int f =
		 * sc.nextInt();
		 */
		if(a>b) {
			System.out.println(a+" is greater");
		}
		else {
			System.out.println(b+" is greater");
		}
		
		sc.close();
		
	}
}