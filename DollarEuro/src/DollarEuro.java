import java.util.*;

public class DollarEuro {

	public static void main(String[] args) {
		// currency converter
		// create a scanner to read from console
		Scanner sc = new Scanner(System.in);
		// data type for creating variable
		double euro;
		double dollar;
		// create object "menu" of class
		String menu;
		// execute instructions
		
		do { // output text on console
			System.out.println("Waehle 1 fuer Euro und 2 fuer Dollar:");
			// read menu items
			menu = sc.next();
			
			// menu item 1 corresponds to input 1
			if (menu.equals("1")) {
				// output text on console
				System.out.println("Bitte geben Sie Euro an:");
				// declare euro as floating point number
				euro = sc.nextDouble();
				// conversion
				dollar = euro * 1.34;
				// output text on console
				System.out.println("Die Waehrung in Dollar betraegt:" + dollar);
			}
			
			// menu item 2 corresponds to input 2
			else if (menu.equals("2")) {
				// output text on console
				System.out.println("Bitte geben Sie Dollar an:");
				// declare dollar as floating point number
				dollar = sc.nextDouble();
				// conversion
				euro = dollar * 0.66;
				// output text on console
				System.out.println("Die Waehrung in Euro betraegt:" + euro);
			}
			
			// output text on console
			System.out.println("Wollen Sie noch eine Umrechnung starten? Ja/Nein");
			// execution of the statement as long as input "Ja"
		} while (sc.next().equals("Ja"));

		// close the scanner input "Nein"
		System.out.println("Umrechnung beendet...");
		sc.close();

	}
}
