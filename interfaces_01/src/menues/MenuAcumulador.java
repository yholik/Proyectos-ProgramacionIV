package menues;

import interfaces.IAcumulador;
import interfaces.IComunicador;
import utiles.Utilidades;

public class MenuAcumulador {
	
	private IAcumulador acumuladorcito;
	private IComunicador comunicadorcito;
	private Utilidades herramienta;
	
	/*------------------------ CONSTRUCTOR --------------------*/
	public MenuAcumulador(IAcumulador acumuladorcito, IComunicador comunicadorcito, Utilidades herramienta) {
	this.acumuladorcito = acumuladorcito;
	this.comunicadorcito = comunicadorcito;
	this.herramienta = herramienta;
	
	}
	
	
	public void iniciar() {
		comunicadorcito.enviar("Bienvenido");
		this.menu();		
		comunicadorcito.enviar("Gracias por usar nuestro sistema");
	}
	
	
	/*---------------- METODOS PROPIOS DE LA CLASE ---------------------------*/
	public void menu() {
		
		boolean flag = true;	
		while(flag) {
			
			comunicadorcito.enviar("1- Agregar numero  2- Mostrar sumatoria  3- Salir");
			int eleccion = herramienta.transformarAInt(comunicadorcito.recibir());			
			
		switch(eleccion) {
		case 1: 
			comunicadorcito.enviar("Ingresa un numero");
			int numero = herramienta.transformarAInt(comunicadorcito.recibir());
			acumuladorcito.acumulador(numero);
			comunicadorcito.enviar("Numero agregado");	
			break;
			
		case 2: 
			comunicadorcito.enviar("La sumatoria total es");
			String stringSuma = herramienta.transformarAString(acumuladorcito.getSumatoria());
			comunicadorcito.enviar(stringSuma);
			break;
			
		case 3 :
			flag = false;
			break;
			
				default:
				comunicadorcito.enviar("Opcion no valida");
				break;
		
		}
		
		}
		
	}
	
	
	/*------------- UTILIDADES (LO PASE A OTRA CLASE)-----------------------*/
	/*
	public int transformarAInt(String num) {
		int numero = Integer.parseInt(num);
				return numero;
	}
	
	public String transformarAString(int num) {
		String nuevoString = Integer.toString(num);
		return nuevoString;
	}
	
	*/
}
