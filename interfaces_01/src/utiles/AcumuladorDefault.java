package utiles;

import interfaces.IAcumulador;

public class AcumuladorDefault extends IAcumulador {
	
	private int acumulado;
	
	
	public AcumuladorDefault() {
		this.acumulado = 0;		
	}
	
	@Override
	public void acumulador(int num) {
		this.acumulado += num;
	}

	@Override
	public int getSumatoria() {
	
		return this.acumulado;
	}

	
}
