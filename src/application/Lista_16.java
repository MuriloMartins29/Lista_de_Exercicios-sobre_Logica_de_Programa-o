package application;

public class Lista_16 {

	public static String classificarTriangulo(double a, double b, double c) {
		if (!(a + b > c && b + c > a && a + c > b)) {
			return "Não é um triângulo válido";
		}
		if (a == b && b == c) {
			return "Triângulo Equilátero";
		}
		if (a == b || b == c || a == c) {
			return "Triângulo Isósceles";
		}
		return "Triângulo Escaleno";
	}
}
