package application;

public class Lista_11 {
	public static String calcularStatusAluno(String nome, double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / notas.length;
        String status = media >= 7 ? "aprovado" : "reprovado";
        return String.format("Aluno: %s\nMédia: %.2f\nStatus: %s", nome, media, status);
    }
}