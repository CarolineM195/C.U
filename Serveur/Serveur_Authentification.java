package Serveur;
//=====================================================
//IMPORTANT :
//NOM DE MES CLASSES VS NOM DANS OPENCLASSEROOM

// Serveur.Serveur_Authentification <=> Authentification
// Client.Client_Connexion <=> Connexion
//======================================================

import java.net.*;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.*;

public class Serveur_Authentification implements Runnable {

    private Socket socket;
    private PrintWriter out = null;
    private BufferedReader in = null;
    private String login = "Anonyme", pass =  null;
    public boolean authentifier = false;
    public Thread t2;

    public Serveur_Authentification(Socket s){
        socket = s;
    }
    public void run() {

        try {

            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream());

            while(!authentifier){

                out.println("Entrez votre login :");
                out.flush();
                login = in.readLine();


                out.println("Entrez votre mot de passe :");
                out.flush();
                pass = in.readLine();

                if(isValid(login, pass)){

                    out.println("connecte");
                    System.out.println("Nice to C.U. " +login);
                    out.flush();
                    authentifier = true;
                }
                else {out.println("erreur"); out.flush();}
            }
            t2 = new Thread(new Serveur_Chat_ClientServeur(socket,login));
            t2.start();

        } catch (IOException e) {

            System.err.println(login+" ne répond pas !");
        }
    }

    private static boolean isValid(String login, String pass) {


        boolean connexion = false;
        try {
            Scanner sc = new Scanner(new File("C.U.txt"));


            while(sc.hasNext()){
                if(sc.nextLine().equals(login+" "+pass)){
                    connexion=true;
                    break;
                }
            }

        } catch (FileNotFoundException e) {
            System.err.println("Le fichier n'existe pas !");
        }
        return connexion;

    }
}