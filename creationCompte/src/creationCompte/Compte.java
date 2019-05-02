package creationCompte;

import java.util.ArrayList;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;

public class Compte {
	private String ident;
	private String mdp;
	private int id ;
	
	//		SETTER
	public void setIdent(String ident){
		this.ident=ident;
	}
	public void setMdp(String mdp){
		this.mdp = mdp;
	}
	//		GETTER
	public String getIdent(){ return ident;}
	public String getMdp(){ return mdp;}
	public int getId(){return id;}
	
	//		CONSTRUCTOR
	public Compte(){} //  Constructeur vide
	public Compte(String ident, String mdp){ // 	>>>>[[Constructeur principal]]<<<<
		setIdent(ident);
		setMdp(mdp);
		id++;
		final String chemin = "C:\\Users\\Caroline\\Desktop\\Workspace attituude\\creationCompte\\creationCompte\\repertoire2.txt";
	    final File fichier =new File(chemin); 
	    final Scanner s = new Scanner(System.in);
	    try {
	        // Creation du fichier
	        //fichier .createNewFile();
	        // creation d'un writer (un écrivain)
	        final FileWriter writer = new FileWriter(fichier,true);
	        final FileReader reader = new FileReader(fichier);
	        BufferedReader br = new BufferedReader(reader);
	        try {
	        	
	        	writer.write("Compte"+id ); // ne fonctionne pas comme il le faut...
	            writer.write("  "+ident );
	            writer.write(" "+mdp);
	            
	            
	            String line = br.readLine();
	            while (line != null) {
	            	 System.out.println(line);
	            	 line = br.readLine();
	            } 
	           
	            
	        } finally {
	            // quoiqu'il arrive, on ferme le fichier
	        	s.close();
	        	br.close();
	        	reader.close();
	        	writer.close();
	        }
	        
	       
	        
	        
	    } catch (Exception e) {
	        System.out.println("Impossible de creer le fichier");
	    }
		
	}
	
	//		METHODS
	//	1. Creation de compte: -Instancie un compte !!!!> MAIS là ça s'avère être inutile
	public void CreerCompte(String nom,String ident, String mdp){
		Compte nom1 = new Compte(ident,mdp);
	}

	//	2. toString classique
	public String toString(){
		return ("Compte num "+getId()+" Identifiant: "+getIdent()+" Mot de passe: "+getMdp());
	}
	

}

