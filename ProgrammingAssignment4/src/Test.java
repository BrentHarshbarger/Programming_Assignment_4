import java.util.Scanner;

public class Test {

	/*-----------------------------------------------------------------------------------------------------------
	/ Brent Harshbarger
	/ August 28, 2020
	/ Programming Fundamentals
	/ Summer 2020
	/ Programming Assignment 4
	/ 
	-------------------------------------------------------------------------------------------------------------*/

	public static void main(String[] args) {

		// Print assignment information
		System.out.println("Programming Fundamentals");
		System.out.println("NAME: Brent Harshbarger");
		System.out.println("PROGRAMMING ASSIGNMENT 4");
		System.out.println();

		Set set = new Set();
		Scanner scanner = new Scanner(System.in);
		int i;

		// Gets user input and processes add, delete, and exist until quit
		while (true) {
			System.out.print("Enter command: ");
			String line = scanner.nextLine();

			String[] ar = line.split(" ");

			if (1 == ar.length && "quit".equals(ar[0])) {
				System.exit(0);
			}

			if (2 != ar.length) {
				System.out.println("Invalid input, wrong number of entries.  Two are required.");
				continue;
			}

			try {
				i = Integer.parseInt(ar[1]);
			} catch (NumberFormatException e) {
				System.out.println("Invalid Input: " + e.getMessage());
				continue;
			}

			// switch statement to execute user choice of process
			switch (ar[0]) {
			case "add":
				set.add(i);
				break;

			case "del":
				set.delete(i);
				break;

			case "exists":
				System.out.println(set.exists(i));
				break;

			default:
				System.out.println("Invalid command:" + ar[0]);
				continue;
			}

			System.out.println(set.toString());

		}

	}

}
