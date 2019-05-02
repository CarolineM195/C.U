package creationCompte;

import java.util.ArrayList;


public class BiblioCompte {
	private ArrayList<Compte> ListeCompte = new ArrayList<Compte>();
	private int nbComptes=0;
	
	//		GETTER
	public ArrayList<Compte> getListeCompte() {
		return ListeCompte;
	}
	
	public int getnbComptes() {
		return nbComptes;
	}
	
	/*public int getId(){
		for (int i =0; i< len(getListeCompte());i++){
			if get(i)==Compte{
				
			}
		}
	}
	*/
	

	//		SETTER
	public void setListeCompte(ArrayList<Compte> listeCompte) {
		ListeCompte = listeCompte;
	}
	
	//		CONSTRUCTOR
	public BiblioCompte(){
		nbComptes=0;
	}

	//		METHODS
	//1. Ajout d'un compte
	public void AjoutCompte(Compte c1){
		
		this.ListeCompte.add(c1);
		nbComptes++;
		
	}

	public Compte get(int i) {
		return ListeCompte.get(i);
	}

	
/*
public boolean Verification(ArrayList<String> listeCompte, String ident) {
		
		int i=0; 
		boolean trouve=false; // Le coup du drapeau ! 
		while (i<listeCompte.size() && trouve==false) {
			
			if (getIdent().equals(listeCompte.get(i))){
				System.out.println("Votre identifiant existe déja.");
				trouve = true;
			}
		}
		return trouve;
	}
*/

	
	/*public void nbComptes(){
		return cl.ListeCompte.size();
		
	}*/
	
	//public void ToString(BiblioCompte b){
		//System.out.println()
	//}
	
}
