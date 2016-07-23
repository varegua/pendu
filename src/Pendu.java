import java.util.Scanner;

public class Pendu {
	private int pom;
	private String motATrouver;
	private char [] motEnCours;
	private int pendu;
	
	public Pendu(String bonjour){
		System.out.println(bonjour);
		this.motATrouver = bonjour;
		this.motEnCours = new char [motATrouver.length()];
		System.out.println(motEnCours);
		this.remplir('_');
		System.out.println(motEnCours);
	}
	
	public void afficher() {
		System.out.println();
	}
	
	public void perdu(){
		if (pendu == 3){
			System.out.println("Vous avez perdu");
			System.exit(1);
		}
	}
	
	public String scanner(){
		System.out.println("Entrer une lettre:");
		Scanner sc = new Scanner(System.in);
		String i = sc.nextLine();
		return i;
	}
	
	public void remplir(char lettre){
		for (int i=0; i < motEnCours.length; i++){
			motEnCours[i]='_';
		}
	}
	
	public boolean verifie(String lettreUtilisateur){
		return lettreUtilisateur.length() == 1;
	}
	
	public void chercheLettre(String lettre){
		int position = 0;
		position = motATrouver.indexOf(lettre, position);
		if (position == -1){
			pendu = pendu+1;
			System.out.println(motEnCours);
			return;
		}
		while (position!=-1){
			position = motATrouver.indexOf(lettre, position);
			if (position == -1){
				System.out.println(motEnCours);
				return;
			}
			motEnCours[position]=motATrouver.charAt(position);
			position=position+1;
		}		
		//motATrouver.lastIndexOf(str, fromIndex);		
	}
	
	public boolean isJeuTermine(){
			for(char lettre:motEnCours){
				if (lettre == '_'){
					System.out.println("Vous avez gagné");
					return false;
				}
			}
			return true;
		}

	
	public void test (int tre) {
		tre = tre +1;
	}


}
