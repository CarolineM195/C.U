import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class AcceptConnections implements Runnable {

    private ServerSocket serverSocket;
    private Socket socketDuServeur;

    public Thread t1;

    public AcceptConnections(ServerSocket ss){
        serverSocket = ss;
    }


    public void run(){
        try {
            while (true) {
                socketDuServeur = serverSocket.accept();
                System.out.println("Nice to C.U. !");

                t1 = new Thread(new Authentification(socketDuServeur));
                t1.start();
            }
        }catch (IOException e){
            System.out.println("Impossible de se connecter !");
        }
    }




}
