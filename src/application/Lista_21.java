package application;

import java.util.Random;

public class Lista_21 {

	public static int gerarNumeroAleatorio() {
		return new Random().nextInt(101);
	}

	public static String calcularSalarioProfessor(double valorHoraAula, int horasLecionadas, double percentualINSS) {
		double salarioBruto = valorHoraAula * horasLecionadas;
		double descontoINSS = salarioBruto * (percentualINSS / 100);
		double salarioLiquido = salarioBruto - descontoINSS;

		return String.format("Salário Bruto: R$%.2f\n" + "Desconto INSS: R$%.2f\n" + "Salário Líquido: R$%.2f",
				salarioBruto, descontoINSS, salarioLiquido);
	}
}
