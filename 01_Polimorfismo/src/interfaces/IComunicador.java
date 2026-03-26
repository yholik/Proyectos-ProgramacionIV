package interfaces;

public abstract class IComunicador {
	
	public abstract void enviar(String mensaje);

	public final void enviarVariasVeces
		(int cantidad, String mensaje) {
		
		for (int i = 0; i < cantidad; i++) {
			this.enviar(mensaje);
		}
		
	}
	public abstract String recibir();
}
