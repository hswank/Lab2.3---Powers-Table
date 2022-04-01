import java.util.Scanner;

public class PowersTable {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String underline = "=======";
		
		System.out.print("Please enter an integer: ");
		int userInput = input.nextInt();
		
		System.out.printf("%-15s%-15s%-15s%n", "Number", "Squared", "Cubed");
		System.out.printf("%-15s%-15s%-15s%n", underline, underline, underline);
		
		for (int i = 1; i <= userInput; i++) {
			System.out.printf("%-15d%-15d%-15d%n", i, (i * i), (i * i * i));
		}
		
		
		System.out.printf("%n");
		System.out.printf("%n");
		System.out.printf("%n");
		
		System.out.print("      ");
		for (int i = 1; i <= userInput; i++) {
			System.out.printf("%4d", i);
		}
		
		System.out.printf("%n      ");
		for (int i = 1; i <= userInput; i++) {
			System.out.printf("%4s", "=");
		}
		
		System.out.printf("%n");
		for (int i = 1; i <= userInput; i++) {
			System.out.printf("%4d%s", i, " |");
			
			for (int j = 1; j <= userInput; j++) {
				System.out.printf("%4d", j * i);
			}
			
			System.out.printf("%n");
		}
	}
}
