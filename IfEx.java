public class IfEx {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		if(age >= 13 && age <= 19) {
			System.out.print("You are Teenager!");
		}
		else {
			System.out.println("You are not Teenager");
		}
		System.out.println("Thanks");
		sc.close();
	}

}

