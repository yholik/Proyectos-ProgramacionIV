package modelos;

public class FechaFestiva implements Comparable<FechaFestiva>{
	private int dia;
	private int mes;
	private String nombre;
	private double fanatismo;
	
	public FechaFestiva(int dia, int mes, String nombre, double fanatismo) {
		this.dia = dia;
		this.mes = mes;
		this.nombre = nombre;
		this.fanatismo = fanatismo;
	}
	
	
	/*----------- GETTERS, SETTERS, TOSTRING -----------*/	
	
	
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public double getFanatismo() {
		return fanatismo;
	}

	public void setFanatismo(double fanatismo) {
		this.fanatismo = fanatismo;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getDiasTotales() {
		return this.dia + (this.mes * 30);		
	}

	@Override
	public String toString() {
		return "FechaFestiva [dia:" + dia + ", mes:" + mes + ", nombre:" + nombre + ", fanatismo:" + fanatismo + "]";
	}
	
	
	
	/*------------ COMPARADORES --------------*/
	public int compareMes(FechaFestiva a, FechaFestiva b) {
		int resultado = 0;
		
		if(a.mes < b.mes) {
			resultado = -1;
		}
		else if(a.mes > b.mes){			
			resultado = 1;
		}
		
		return resultado;
		
	}

	public int compareDia(FechaFestiva a, FechaFestiva b) {
		int resultado = 0;
		return resultado = Integer.compare(a.getDiasTotales(),b.getDiasTotales());
		
	}
	
	public int compareNombre(FechaFestiva a, FechaFestiva b) {
		int resultado = 0;
		String s1 = a.nombre;
		String s2 = b.nombre;
		return resultado = s1.compareTo(s2); 
	}
	
	public int compareFanatismo(FechaFestiva a, FechaFestiva b) {
		int resultado = 0;
		double a1 = a.getFanatismo();
		double a2 = b.getFanatismo();
		return resultado = Double.compare(a1, a2); 
	}
	
	@Override
	public int compareTo(FechaFestiva otraFecha) {		
		return this.getDiasTotales() - otraFecha.getDiasTotales();
	}

	/*-------------------------------------------*/
	
	
	
	
}
