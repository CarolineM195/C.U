package Serveur;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Serveur_Emission implements Runnable {

    private PrintWriter out;
    private String message = null;
    private Scanner sc = null;

    public Serveur_Emission(PrintWriter out) {
        this.out = out;
    }


    public void run() {

        sc = new Scanner(System.in);

        while(true){
            System.out.println("Votre message :");
            message = sc.nextLine();
            out.println(message);
            out.flush();
        }
    }
}
