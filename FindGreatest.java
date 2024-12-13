//WAP to find the greatest number among the two numbers.
public class FindGreatest {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("Enter the 1st nos.:");
		int a = sc.nextInt();
		System.out.print("Enter the 2nd nos.:");
		int b= sc.nextInt();
		
		if(a>b) {
			System.out.println("1st no is greater than 2nd no");
		}else {
			System.out.println("2nd no is greater than 1st no");
		}
		
		sc.close();
	}

}
