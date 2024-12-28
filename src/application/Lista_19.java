package application;

public class Lista_19 {

	public static String imprimirTodasTabuadas() {
		StringBuilder resultado = new StringBuilder();
		for (int i = 1; i <= 10; i++) {
			resultado.append("Tabuada do ").append(i).append(":\n");
			for (int j = 1; j <= 10; j++) {
				resultado.append(String.format("%d x %d = %d\n", i, j, i * j));
			}
			resultado.append("\n");
		}
		return resultado.toString();
	}
}
