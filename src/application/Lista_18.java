package application;

public class Lista_18 {
	public static int calcularDiferencaAltura() {
		int alturaFrancisco = 150; // cm
		int alturaSara = 110; // cm
		int anos = 0;

		while (alturaSara <= alturaFrancisco) {
			alturaFrancisco += 2; // Francisco cresce 2cm/ano
			alturaSara += 3; // Sara cresce 3cm/ano
			anos++;
		}

		return anos;
	}
}
