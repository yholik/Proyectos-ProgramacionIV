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
	
	
	/*-------------------------------------------*/
	
	
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

	
	/*-------------------------------------------*/
	
	
	@Override
	public String toString() {
		return "FechaFestiva [dia:" + dia + ", mes:" + mes + ", nombre:" + nombre + ", fanatismo:" + fanatismo + "]";
	}	
	
	
	/*----------ORDENAMIENTO NATURAL-------------*/
	
	@Override
	public int compareTo(FechaFestiva otraFecha) {		
		return this.getDiasTotales() - otraFecha.getDiasTotales();
	}

	
	/*-------------------------------------------*/
	
	
	
	
}
