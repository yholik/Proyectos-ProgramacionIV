
	package utiles;

	import java.util.Scanner;

	import interfaces.IComunicador;

	public class ComunicadorMayuscula 
		extends IComunicador{

		
		private Scanner sc;
		
		public ComunicadorMayuscula() {
			this.sc = new Scanner(System.in);
		}
		
		@Override
		public void enviar(String mensaje) {
			System.out.println(mensaje.toUpperCase());
			
		}

		@Override
		public String recibir() {
			return sc.next().toUpperCase();
		}

	}


