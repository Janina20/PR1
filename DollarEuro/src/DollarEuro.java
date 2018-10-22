import java.util.*;

public class DollarEuro {

	public static void main(String[] args) {

		// create a scanner (and name it "sc") to read from console
		Scanner sc = new Scanner(System.in);
		// declare variable
		double euro;
		double dollar;
		// start do-while-loop
		do {
			// print out text between "" on console
			System.out.println("Waehle 1 fuer Euro und 2 fuer Dollar:");
			// open scanner for menu case
			String wahl = sc.next();
			// if condition for case 1 (Euro in Dollar)
			if (wahl.equals("1")) {
				// print out text on console
				System.out.println("Bitte geben Sie Euro an:");
				// take variable euro for input
				euro = sc.nextDouble();
				// conversion
				dollar = euro * 1.34;
				// print out text + result on console
				System.out.println("Die Waehrung in Dollar betraegt:" + dollar);
			}
			// if condition case 2 (Dollar in Euro)
			else if (wahl.equals("2")) {
				// print out text on console
				System.out.println("Bitte geben Sie Dollar an:");
				// take variable dollar for input
				dollar = sc.nextDouble();
				// conversion
				euro = dollar * 0.66;
				// print out text on console
				System.out.println("Die Waehrung in Euro betraegt:" + euro);
			}
			// print out text on console
			System.out.println("Wollen Sie noch eine Umrechnung starten? Ja/Nein");
			// if input "Ja" got to do-loop
		} while (sc.next().equals("Ja"));

		// if input "Nein" finish program and close Scanner
		System.out.println("Umrechnung beendet...");
		sc.close();
	}
}
