package application;

public class Lista_22 {

	public static class DadosViagem {
		public final double distancia;
		public final double tempo;
		public final double velocidade;
		public final double combustivel;

		public DadosViagem(double tempo, double velocidadeMedia) {
			this.tempo = tempo;
			this.velocidade = velocidadeMedia;
			this.distancia = tempo * velocidadeMedia;
			this.combustivel = distancia / 12;
		}

		@Override
		public String toString() {
			return String.format("Tempo: %.1f horas\n" + "Velocidade média: %.1f km/h\n" + "Distância: %.1f km\n"
					+ "Combustível usado: %.1f litros", tempo, velocidade, distancia, combustivel);
		}
	}
}
