public class Square {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("Enter a no.:");
		int a = sc.nextInt();
		int s = a*a;
		System.out.print(s);
	
		sc.close();
	}

}