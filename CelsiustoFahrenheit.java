//WAP to convert Celsius to Fahrenheit.
public class CelsiustoFahrenheit {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		 System.out.print("Enter temperature in Celsius: ");
	        double celsius = sc.nextDouble(); 

	        double fahrenheit = (celsius * 9 / 5) + 32;

	        System.out.println(fahrenheit);
	        
	        sc.close();
	    }
	}
