

import java.util.Scanner;

public class LabValidator {
	public static String getString(Scanner sc, String prompt) {
		System.out.print(prompt);
		String s = sc.nextLine(); // read user entry
		sc.nextLine(); // discard any other data entered on the line
		return s;
	}
	
	public static String getString(Scanner sc, String prompt, String studentChosen) {
		System.out.print(prompt);
		// read user entry
		String s = sc.nextLine();
		boolean isValid = false;
		while (!isValid) {
			if (!s.equalsIgnoreCase("hometown") && !s.equalsIgnoreCase("food")) {
				System.out.println("Please enter hometown or food: ");
				s = sc.nextLine();
				isValid = false;
			} else {
				isValid = true;
			}
		}
		return s;
	}

	public static int getInt(Scanner sc, String prompt) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextInt()) {
				i = sc.nextInt();
				isValid = true;
			} else {
				System.out.println("Error! Invalid integer value. Try again.");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return i;
	}

	public static int getInt(Scanner sc, String prompt, int min, int max) {
		int i = 0;
		boolean isValid = false;
		while (isValid == false) {
			i = getInt(sc, prompt);
			if (i < min)
				System.out.println("Error! Number must be " + min + " or greater.");
			else if (i > max)
				System.out.println("Error! Number must be " + max + " or less.");
			else
				isValid = true;
		}
		return i;
	}

	public static double getDouble(Scanner sc, String prompt) {
		double d = 0;
		boolean isValid = false;
		while (isValid == false) {
			System.out.print(prompt);
			if (sc.hasNextDouble()) {
				d = sc.nextDouble();
				isValid = true;
			} else {
				System.out.println("Error! Invalid decimal value. Try again.");
			}
			sc.nextLine(); // discard any other data entered on the line
		}
		return d;
	}

	public static double getDouble(Scanner sc, String prompt, double min, double max) {
		double d = 0;
		boolean isValid = false;
		while (isValid == false) {
			d = getDouble(sc, prompt);
			if (d < min)
				System.out.println("Error! Number must be " + min + " or greater.");
			else if (d > max)
				System.out.println("Error! Number must be " + max + " or less.");
			else
				isValid = true;
		}
		return d;
	}
	
	public static String myRegex(Scanner scan, String prompt, String regex) {
		boolean valid = false;
		String input;
		
		do {
			input = getString(scan, prompt);
			if (input.matches(regex)) {
			valid = true;
		} else {
			System.out.println("Input must match correct format");
			valid = false;
		}
		} while (!valid);
		
		return input;
	}
}