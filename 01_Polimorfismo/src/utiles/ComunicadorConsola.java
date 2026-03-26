package utiles;

import java.util.Scanner;

import interfaces.IComunicador;

public class ComunicadorConsola 
	extends IComunicador{

	
	private Scanner sc;
	
	public ComunicadorConsola() {
		this.sc = new Scanner(System.in);
	}
	
	@Override
	public void enviar(String mensaje) {
		System.out.println(mensaje);
		
	}

	@Override
	public String recibir() {
		return sc.next();
	}

}
