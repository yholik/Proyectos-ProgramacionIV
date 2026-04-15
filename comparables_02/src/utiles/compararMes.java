package utiles;

import java.util.Comparator;

import modelos.FechaFestiva;

public class compararMes implements Comparator<FechaFestiva>{

	@Override
	public int compare(FechaFestiva a, FechaFestiva b) {
		int resultado = 0;
		
		if(a.getMes() < b.getMes()) {
			resultado = -1;
		}
		else if(a.getMes() > b.getMes()){			
			resultado = 1;
		}
		
		return resultado;	
	}

}
