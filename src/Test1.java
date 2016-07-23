import java.util.ArrayList;

public class Test1 {
	public static void main (String[] test){
		Pendu pendu = new Pendu("bonjour");
		while (!pendu.isJeuTermine()){
			pendu.afficher();
			String scanUtilisateur = pendu.scanner();
			boolean lettre = pendu.verifie(scanUtilisateur);
			while(!lettre){
				pendu.scanner();
			}
			pendu.chercheLettre(scanUtilisateur);
			pendu.perdu();
		}
		
		ArrayList<String> pomme = new ArrayList<>();
		pomme.add("poire");
		System.out.println(pomme.get(0));
	}
}
