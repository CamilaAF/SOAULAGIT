package controller;

public class Operacoes {
	public void VetorPreencher() {
		
			String[] vetor = new String[100000];
			double TempoInicial = System.nanoTime();
			
			for(int i = 0; i < 100000;i++) {
				vetor[i] = "";
			}
			double tempoFinal = System.nanoTime();
			double tempoTotal = tempoFinal - TempoInicial;
			
			tempoTotal = tempoTotal / (Math.pow(10, 9));
			
			System.out.println("vetor==>"+tempoTotal+"segundos");
	}
}
