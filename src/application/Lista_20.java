package application;

public class Lista_20 {

	public static String imprimirTabuada(int numero) {
		StringBuilder resultado = new StringBuilder();
		resultado.append("Tabuada do ").append(numero).append(":\n");
		for (int i = 1; i <= 10; i++) {
			resultado.append(String.format("%d x %d = %d\n", numero, i, numero * i));
		}
		return resultado.toString();
	}
}
