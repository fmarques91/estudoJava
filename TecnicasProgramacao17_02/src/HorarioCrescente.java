package horario;

public class HorarioCrescente {

	public static void main(String[] args) {
		String horaCerta, minutoCerto;
		for (int hora = 0; hora < 24; hora++) {
			if (hora < 10) {
				horaCerta = "0" + hora;
			} 
			else {
				horaCerta = "" + hora;
			}
			for (int minuto = 0; minuto < 60; minuto++) {
				if (minuto < 10) {
					minutoCerto = "0" + minuto;
				} 
				else {
					minutoCerto = "" + minuto;
				}
				System.out.println(horaCerta + ":" + minutoCerto);
			}

		}

	}

}