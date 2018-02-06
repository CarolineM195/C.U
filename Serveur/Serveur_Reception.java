package Serveur;

import java.io.BufferedReader;
import java.io.IOException;


public class Serveur_Reception implements Runnable {

    private BufferedReader in;
    private String message = null, login = null;

    public Serveur_Reception(BufferedReader in, String login){

        this.in = in;
        this.login = login;
    }

    public void run() {

        while(true){
            try {

                message = in.readLine();
                System.out.println(login+" : "+message);

            } catch (IOException e) {

                e.printStackTrace();
            }
        }
    }

}
