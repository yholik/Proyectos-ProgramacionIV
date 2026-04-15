package mains;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import modelos.FechaFestiva;
import utiles.compararDia;
import utiles.compararFanatismo;
import utiles.compararMes;
import utiles.compararNombre;

public class Main {

	public static void main (String[] args) {
		
		
		/*------------CREO LA LISTA QUE CONTIENE LAS FECHAS---------------------*/
		List<FechaFestiva> fechas = new ArrayList<FechaFestiva>();
	
		
		/*-----------AÑADO FECHAS RANDOM GENERADAS CON IA------------*/
		fechas.add(new FechaFestiva(25, 12, "Navidad", 10.0));
		fechas.add(new FechaFestiva(2, 4, "Malvinas", 9.1));
		fechas.add(new FechaFestiva(14, 2, "San Valentín", 7.2));
		fechas.add(new FechaFestiva(9, 7, "Independencia", 9.3));
		fechas.add(new FechaFestiva(5, 1, "Año Nuevo", 8.5));
		fechas.add(new FechaFestiva(20, 6, "Día de la Bandera", 7.9));
		fechas.add(new FechaFestiva(24, 3, "Memoria", 6.8));
		fechas.add(new FechaFestiva(17, 8, "San Martín", 8.0));
		fechas.add(new FechaFestiva(1, 5, "Día del Trabajador", 8.0));
		fechas.add(new FechaFestiva(25, 5, "Día de la Patria", 9.5));
		
		/*-------------CREO LOS COMPARADORES-------------------------*/
		
		Comparator<FechaFestiva> compDia = new compararDia();
		Comparator<FechaFestiva> compFana = new compararFanatismo();
		Comparator<FechaFestiva> compMes = new compararMes();
		Comparator<FechaFestiva> compNombre = new compararNombre();
		
		//Comparador mixto, primero compara el mes y luego el dia
		Comparator<FechaFestiva> compMesYDia = compMes.thenComparing(compDia);
		
		//Comparador mixto, primero compara fanatismo ascendente y luego nombre descendente
		Comparator<FechaFestiva> compFanNombre= compFana.thenComparing(compNombre.reversed());

		
		
		/*----------VER LISTADO COMPLETO FECHAS----------*/
		System.out.println("**************LISTADO COMPLETO************");
		for(FechaFestiva fecha : fechas) {
			System.out.println(fecha);
		}
		
		/*----------VER LISTADO POR NOMBRE----------*/
		System.out.println("**************ORDENAMIENTO NOMBRE************");
		fechas.sort(compNombre);
		for(FechaFestiva fecha : fechas) {			
			System.out.println(fecha);
		}
		
		/*----------VER LISTADO POR ORD NATURAL----------*/
		System.out.println("**************ORDENAMIENTO NATURAL************");
		fechas.sort(null);  //Al poner null utiliza el ordenamiento natural declarado en la clase
		for(FechaFestiva fecha : fechas) {			
			System.out.println(fecha);
		}
		
		/*----------VER LISTADO POR DIA----------*/
		System.out.println("**************ORDENAMIENTO DIA************");

		fechas.sort(compDia);
		for(FechaFestiva fecha : fechas) {			
			System.out.println(fecha);
		}
		
		/*----------VER LISTADO POR MES----------*/
		System.out.println("**************ORDENAMIENTO MES************");
		fechas.sort(compMes);
		for(FechaFestiva fecha : fechas) {			
			System.out.println(fecha);
		}
		
		/*----------VER LISTADO POR FANATISMO----------*/
		System.out.println("**************ORDENAMIENTO FANATISMO DE MENOR A MAYOR************");
		fechas.sort(compFana);
		for(FechaFestiva fecha : fechas) {			
			System.out.println(fecha);
		}
		
		System.out.println("**************ORDENAMIENTO FANATISMO DE MAYOR A MENOR************");
		fechas.sort(compFana.reversed());
		for(FechaFestiva fecha : fechas) {			
			System.out.println(fecha);
		}
			
		System.out.println("**************ORDENAMIENTO POR MES Y DIA************");
		fechas.sort(compMesYDia);
		for(FechaFestiva fecha : fechas) {			
			System.out.println(fecha);
		}

		
		System.out.println("**************ORDENAMIENTO POR FANATISMO ASC Y NOMBRE DESC************");
		fechas.sort(compFanNombre);
		for(FechaFestiva fecha : fechas) {			
			System.out.println(fecha);
		}
		
		
/*

9. DIFICIL: Mostrar el listado ordenado por fanatismo (ascendente) y nombre (decente) 
*/
		
	}
}
