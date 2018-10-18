import java.util.*;

public class DollarEuro {

	public static void main(String[] args) {
		// currency converter
		// read from console
		Scanner sc = new Scanner(System.in);
		// data type for creating variable
		double euro;
		double dollar;
		// create object menu of class
		String menu;
		// execute instructions
		do { // output text on the console
			System.out.println("Waehle 1 fuer Euro und 2 fuer Dollar:");
			// read menu items
			menu = sc.next();

			if (menu.equals("1")) {
				System.out.println("Bitte geben Sie Euro an:");
				euro = sc.nextDouble();
				dollar = euro * 1.34;

				System.out.println("Die Waehrung in Dollar betraegt:" + dollar);
			}

			else if (menu.equals("2")) {
				System.out.println("Bitte geben Sie Dollar an:");
				dollar = sc.nextDouble();
				euro = dollar * 0.66;

				System.out.println("Die Waehrung in Euro betraegt:" + euro);
			}

			System.out.println("Wollen Sie noch eine Umrechnung starten? Ja/Nein");
			// execution of the statement as long as true
		} while (sc.next().equals("Ja"));

	}

}
