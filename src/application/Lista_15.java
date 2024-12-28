package application;

public class Lista_15 {

	public static String calcularTempoVivido(int anoNascimento, int anoAtual) {
		int totalDias = (anoAtual - anoNascimento) * 365;
		int anos = totalDias / 365;
		int meses = (totalDias % 365) / 30;
		int dias = (totalDias % 365) % 30;
		return String.format("%d anos, %d meses e %d dias", anos, meses, dias);
	}
}
