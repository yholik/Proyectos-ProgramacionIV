package utiles;

import java.util.Comparator;

import modelos.FechaFestiva;

public class compararNombre implements Comparator<FechaFestiva>{

	@Override
	public int compare(FechaFestiva a, FechaFestiva b) {
		int resultado = 0;		
		return resultado = a.getNombre().compareTo(b.getNombre()); 
		
	}

}
