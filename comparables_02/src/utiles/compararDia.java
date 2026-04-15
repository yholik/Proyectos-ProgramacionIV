package utiles;

import java.util.Comparator;

import modelos.FechaFestiva;

public class compararDia implements Comparator<FechaFestiva> {

	@Override
	public int compare(FechaFestiva a, FechaFestiva b) {
		int resultado = 0;
		return resultado = Integer.compare(a.getDia(),b.getDia());
	}

}
