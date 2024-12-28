package application;

public class Lista_12 {

	public static double calcularPrecoFinal(double preco, int formaPagamento) {
		switch (formaPagamento) {
		case 1: // Dinheiro ou Pix
			return preco * 0.85;
		case 2: // Cartão de crédito à vista
			return preco * 0.90;
		case 3: // 2x no cartão
			return preco;
		case 4: // 3x ou mais no cartão
			return preco * 1.10;
		default:
			return preco;
		}
	}
}
