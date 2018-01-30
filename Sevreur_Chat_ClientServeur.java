import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Sevreur_Chat_ClientServeur implements Runnable {

    private Socket socket;
    private BufferedReader in;
    private PrintWriter out;
    private String login = "Anonyme";
    private Thread t3, t4;

    public Sevreur_Chat_ClientServeur(Socket s, String login){
        socket = s;
        this.login = login;
    }

    public void run(){

        try {
            in = new BufferedReader((new InputStreamReader(socket.getInputStream())));
            out = new PrintWriter(socket.getOutputStream());

            Thread t3 = new Thread(new Reception(in, login));
            t3.start();

            Thread t4 = new Thread(new Emission(out));
            t4.start();
        }catch (IOException e){
            System.err.println("\nC.U. tomorrow " + login);
        }
    }


}
