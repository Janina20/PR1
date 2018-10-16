import java.util.*;
public class DollarEuro {

	public static void main(String[] args) {
		// Waehrungsrechner
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Bitte geben Sie Euro an");
		
		while(true){
			String s = sc.next();
			if (s.equals("1")) {
				double euro = sc.nextFloat();
				
				double dollar = euro*1.34;
				
				System.out.println("Die Währung in Dollar beträgt:"+dollar);
				
				
					
			}
			else if (s.equals("2")) {
				System.out.println("Bitte geben Sie Dollar an");
				dollar = sc.nextFloat();
				
				euro = dollar*0.66;
				
				System.out.println("Die Währung in Euro beträgt:"+euro);	
			}
		}
}