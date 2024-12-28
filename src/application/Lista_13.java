package application;

public class Lista_13 {

	public static String verificarMaioridade(String nome, int idade) {
		String status = idade >= 18 ? "maior" : "menor";
		return nome + " é " + status + " de idade";
	}
}
