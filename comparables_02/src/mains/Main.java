package mains;

import java.util.ArrayList;
import java.util.List;

import modelos.FechaFestiva;

public class Main {

	public static void main (String[] args) {
		
		List<FechaFestiva> fechas = new ArrayList<FechaFestiva>();
	
		fechas.add(new FechaFestiva(25, 12, "Navidad", 10.0));
		fechas.add(new FechaFestiva(2, 4, "Malvinas", 9.1));
		fechas.add(new FechaFestiva(14, 2, "San Valentín", 7.2));
		fechas.add(new FechaFestiva(9, 7, "Independencia", 9.3));
		fechas.add(new FechaFestiva(5, 1, "Año Nuevo", 8.5));
		fechas.add(new FechaFestiva(20, 6, "Día de la Bandera", 7.9));
		fechas.add(new FechaFestiva(24, 3, "Memoria", 6.8));
		fechas.add(new FechaFestiva(17, 8, "San Martín", 8.7));
		fechas.add(new FechaFestiva(1, 5, "Día del Trabajador", 8.0));
		fechas.add(new FechaFestiva(25, 5, "Día de la Patria", 9.5));
		
		/*----------VER LISTADO COMPLETO FECHAS----------*/
		System.out.println("**************LISTADO COMPLETO************");
		for(FechaFestiva fecha : fechas) {
			System.out.println(fecha);
		}
		
		
		/*----------ORDENAMIENTO POR NOMBRE----------*/
		System.out.println("**************ORDENAMIENTO POR NOMBRE************");
		fechas.sort((a,b) -> compareNombre(a, b));
		//TODO ME ENREDE EN LA EJECUCION DE LOS METODOS EN MAIN
		
		/*----------VER LISTADO POR ORD NATURAL----------*/
		System.out.println("**************ORDENAMIENTO NATURAL************");
		fechas.sort(null);
		for(FechaFestiva fecha : fechas) {			
			System.out.println(fecha);
		}
		
		
		
		
		
/*2. Mostrar el listado completo de fechas. 
3. Mostrar el listado ordenado por nombre. 
4. Mostrar el listado ordenado por su ordenamiento natural. LISTO
5. Mostrar ordenado por día 
6. Mostrar el listado de fechas por fanatismo de mayor a menor (reversed). 
7. Mostrar ordenado por mes 
8. Mostrar ordenado por mes y día (Utilizando andThen) 
9. DIFICIL: Mostrar el listado ordenado por fanatismo (ascendente) y nombre (decente) */
		
	}
}
