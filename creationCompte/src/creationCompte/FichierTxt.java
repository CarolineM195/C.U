package creationCompte;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;

public class FichierTxt {
	public static void main (String[] args) {
        final String chemin = "C:\\Users\\Caroline\\Desktop\\Workspace attituude\\creationCompte\\creationCompte\\repertoire.txt";
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
            	String id = s.nextLine();
            	String mdp = s.nextLine();
            	
                writer.write("  "+id);
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
}
	
	
	

	/*
    public static void demande () throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le nom :");
        String nom = sc.nextLine();
        System.out.println("Entrer le numéro :");
        String numero = sc.nextLine();
        
        BufferedWriter bw = new BufferedWriter(new FileWriter("repertoire.txt"));
        PrintWriter pWriter = new PrintWriter(bw,true);
        pWriter.print(nom+":"+numero);
        pWriter.close() ;
         
        System.out.println("Le numéro a été ajouté à votre répertoire");
    }
    public static void main(String[] args) throws IOException
    {
        demande();
    }	
	
}

*/
