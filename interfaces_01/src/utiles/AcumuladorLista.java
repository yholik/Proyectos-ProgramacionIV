package utiles;

import java.util.ArrayList;

import interfaces.IAcumulador;

public class AcumuladorLista extends IAcumulador{

private ArrayList<Integer> listaNumeros;
	
	public AcumuladorLista() {
		this.listaNumeros = new ArrayList<Integer>();
	}
	
	@Override
	public void acumulador(int num) {
		this.listaNumeros.add(num);
	}

	@Override
	public int getSumatoria() {
		int total = 0;
		for(int i = 0; i < this.listaNumeros.size(); i++) {
			total = total + this.listaNumeros.get(i);			
		}
		return total;
	}

	
}
