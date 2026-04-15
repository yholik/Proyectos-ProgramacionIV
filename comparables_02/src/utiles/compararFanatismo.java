package utiles;

import java.util.Comparator;

import modelos.FechaFestiva;

public class compararFanatismo implements Comparator<FechaFestiva>{

	@Override
	public int compare(FechaFestiva a, FechaFestiva b) {
		int resultado = 0;
		return resultado = Double.compare(a.getFanatismo(), b.getFanatismo()); 
	}

}
