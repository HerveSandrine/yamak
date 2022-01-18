import.java.util.Scanner;
public class MonApplication7(
	public static void main (String[arg]){
	System.out.println("demo boucle while");
	
	String prenom;
	char reponse = "O";
	Scanner sc= new Scanner (System.in); 
	// tant que la reponse donnée est egale a oui ...
	while (reponse == "O");
	{ 	//on affiche une instruction
	System.out.println("donnez un prénom : ");
	// on recupere le prenom saisi
	prenom = sc nextline();
	//On affiche notre phase avec le prenom
	System.out.println("Bonjour"+ prenom +",comment vas tu?");
	// On demande si la femme veux faire un autre essai
	System.out.println(" voulez vous réessayez? (O/N)");
	//On recupere la reponse de l'utilisateur
	reponse= sc nextline(). charAt(0);
	}
	System.out.println( "Au revoir...)";
	}
)
