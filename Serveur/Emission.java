package Serveur;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Emission implements Runnable{
	private PrintWriter out;
	private String message;
	private Scanner sc = null;
	
	public Emission (PrintWriter out){
		this.out = out;
	}

	@Override
	public void run() {
		sc = new Scanner(System.in);
		
		while(true){
			System.out.println("votre message");
			message = sc.nextLine();
			out.println(message);
			out.flush();
		}
	}

}
