package main;

import interfaces.IAcumulador;
import interfaces.IComunicador;
import menues.MenuAcumulador;
import utiles.AcumuladorDefault;
import utiles.AcumuladorLista;
import utiles.ComunicadorConsola;
import utiles.Utilidades;

public class Main {
	public static void main(String[] args) {
	IComunicador comu = new ComunicadorConsola();
	IAcumulador acum = new AcumuladorDefault();
	IAcumulador acumL = new AcumuladorLista();
	Utilidades util = new Utilidades();
	MenuAcumulador menu1 = new MenuAcumulador(acum, comu, util);
	MenuAcumulador menu2 = new MenuAcumulador(acumL, comu, util);
	
	
	comu.enviar("Elige una opcion");
	comu.enviar("1- Acumulador simple | 2- Acumulador lista | 3- Salir");
	int opc = util.transformarAInt(comu.recibir());
	
	switch (opc) {
	case 1: 
		/*----- INICIO CON ACUMULADOR SIMPLE ------*/
			menu1.iniciar();
			break;
			case 2:
				/*----- INICIO CON ACUMULADOR LISTA -----*/
				menu2.iniciar();
				break;
			case 3:
				comu.enviar("Salida exitosa");
				default: comu.enviar("Opcion invalida");
				break;
	}
	}
}
