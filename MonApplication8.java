import java.util.Scanner;

public class MonApplication8 {

	public static void main(String arg[]) {
	
	System.out.println("demo boucle do..while");
	String prenom= new String();
	
	char reponse =' ';
	Scanner sc = new scanner(System.in);

	
	do{
		System.out.println("Donnez un prenom :");
		prenom = sc.nextLine();
		System.out.println("Bonjour"+prenom+", comment vas-tu ?");
	
		do{
			System.out.println("Voulez vous reessayer? (O/N)");
			reponse = sc.nextline(). charAt(0);
		} while(reponse != 'o' );
		
	} while(reponse == '0');
	
	System.out.println("Au revoir...") ;
	}
}