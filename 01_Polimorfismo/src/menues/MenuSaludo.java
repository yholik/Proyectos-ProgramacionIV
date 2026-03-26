package menues;

import interfaces.IComunicador;

public class MenuSaludo {
	
	private IComunicador comunicador;

	public MenuSaludo(IComunicador comunicador) {
		this.comunicador = comunicador;
	}
	
	
	public void iniciar() {
		
		comunicador.enviar("Hola");
		while(true) {
			
		comunicador.enviar("Como estas?");
		String respuesta = comunicador.recibir();
		
		comunicador.enviar("Me alegro :)");
		}
		
		
		
	}
	
	

}
