package Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client_Chat_ClientServeur implements Runnable {
    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;
    private Scanner sc;
    private Thread t3, t4;


    public Client_Chat_ClientServeur(Socket s) {
        socket = s;
    }


    public void run() {
        try {
            out = new PrintWriter(socket.getOutputStream());
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            sc = new Scanner(System.in);

            Thread t4 = new Thread(new Client_Emission(out));
            t4.start();
            Thread t3 = new Thread(new Client_Reception(in));
            t3.start();
        } catch (IOException e) {
            System.err.println("Le serveur s'est déconnecté");
        }
    }
}