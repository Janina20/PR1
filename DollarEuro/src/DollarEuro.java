import java.util.*;
public class DollarEuro {

	public static void main(String[] args) {
		// Waehrungsrechner
		
		
		Scanner sc = new Scanner (System.in);
		double euro;
		double dollar;
		
		
		do {
			System.out.println("Gib einen Menuepunkt ein:");
			String menu = sc.next();
			if (menu.equals("1")) {
				System.out.println("Bitte geben Sie Euro an");
				euro = sc.nextFloat();
				dollar = euro*1.34;
				
				System.out.println("Die W�hrung in Dollar betr�gt:"+dollar);
				
				
					
			}
			else if(menu.equals("2")) {
				System.out.println("Bitte geben Sie Dollar an");
				dollar = sc.nextFloat();
				euro = dollar*0.66;
				
				System.out.println("Die W�hrung in Euro betr�gt:"+euro);	
			}
		}while();
}
}