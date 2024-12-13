//WAP to find a given number is even or odd.
public class FindoddEven {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("Enter the nos:");
		int a = sc.nextInt();
		if(a%2 == 0) {
			System.out.println("This is even no");
		}else{
			System.out.println("This is odd no");
		}
		
		sc.close();
	}

}
