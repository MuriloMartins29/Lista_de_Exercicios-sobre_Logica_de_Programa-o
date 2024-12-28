package application;

import java.util.Scanner;

public class Lista_09 {

    public static void main(String[] args) {
        Float peso = null;
        Float altura = null;
        Float imc = null;

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Insira seu peso (kg): ");
            peso = sc.nextFloat();
            if (peso <= 0) {
                System.out.println("Peso deve ser maior que 0.");
                return;
            }

            System.out.print("Insira sua altura (m): ");
            altura = sc.nextFloat();
            if (altura <= 0) {
                System.out.println("Altura deve ser maior que 0.");
                return;
            }

            imc = peso / (altura * altura);
            System.out.printf("Seu IMC é: %.2f\n", imc);

            System.out.print("Classificação: ");
            if (imc < 18.5) {
                System.out.println("Abaixo do Peso");
            } else if (imc >= 18.5 && imc <= 24.9) {
                System.out.println("Peso Ideal (Parabéns!)");
            } else if (imc >= 25.0 && imc <= 29.9) {
                System.out.println("Levemente Acima do Peso");
            } else if (imc >= 30.0 && imc <= 34.9) {
                System.out.println("Obesidade Grau I");
            } else if (imc >= 35.0 && imc <= 39.9) {
                System.out.println("Obesidade Grau II (Severa)");
            } else {
                System.out.println("Obesidade Grau III (Mórbida)");
            }
        } catch (Exception e) {
            System.out.println("Entrada inválida. Por favor, insira valores numéricos válidos.");
        } finally {
            sc.close();
        }
    }
}
