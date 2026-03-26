package main;

import interfaces.IComunicador;
import menues.MenuSaludo;
import utiles.ComunicadorConsola;
import utiles.ComunicadorMayuscula;

public class Main {

	public static void main(String[] args) {
		
		IComunicador comu = new ComunicadorMayuscula();
		
		MenuSaludo menu = new MenuSaludo(comu);
		
				menu.iniciar();
	}
	
}
