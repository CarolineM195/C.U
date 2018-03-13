package creationCompte;
import java.util.ArrayList;
public class TestCompte {

	public static void main(String[] args) {
		Compte co1 = new Compte("Identifiant","easymdp");
		Compte co2 = new Compte("Identifiant2","easymdp2");
		Compte co3 = new Compte("Identifiant3","easymdp3");
		Compte co4 = new Compte("fifi","brindacier");
		Compte co5 = new Compte("buffy","vampire");
		//CreerCompte("unc","pseudo","lemdp");
		

		BiblioCompte list = new BiblioCompte();
		list.AjoutCompte(co1);
		list.AjoutCompte(co2);
		list.AjoutCompte(co3);
		//list.add(co1);
		//System.out.println(list.getListeCompte());
		//System.out.println(co1.toString() );
		//System.out.println(co2.toString() );
		//System.out.println("liste :"+"Compte 1 = "+list.get(0)+ "Compte 2 = "+list.get(1));
		//System.out.println(list.get(0));
		
		System.out.println("Contenue de la bibliotheque de compte");
		for (int j = 0; j < list.getnbComptes(); j++) {
			System.out.println(list.get(j)); } 
		}
		//System.out.println(getId().co2);

	private static void CreerCompte(String string, String string2) {
		// TODO Auto-generated method stub
		
	}


	

}

