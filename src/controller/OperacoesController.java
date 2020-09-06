package controller;

import java.util.Random;

public class OperacoesController {
	
	public OperacoesController() {
		super();
				
	}
	
	public void randCem() {
		Random random = new Random();
		double tempoInicial = System.nanoTime();
		int vet[] = new int [100];
		for (int i = 0; i < 100; i ++) {
			int rand = random.nextInt(10);
			vet[i] = vet[i] + rand;
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 6);
		System.out.println("Vetor de 100 posições ==> " + tempoTotal + "s");
	}
	
	public void randMil() { 
		Random random = new Random();
		double tempoInicial = System.nanoTime();
		int vet[] = new int [1000];
		for (int i = 0; i < 1000; i ++) {
			int rand = random.nextInt(10);
			vet[i] = vet[i] + rand;
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 6);
		System.out.println("Vetor de 1000 posições ==> " + tempoTotal + "s");
	}
	
	public void randDmil() {
		Random random = new Random();
		double tempoInicial = System.nanoTime();
		int vet[] = new int [10000];
		for (int i = 0; i < 10000; i ++) {
			int rand = random.nextInt(10);
			vet[i] = vet[i] + rand;
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 6);
		System.out.println("Vetor de 10000 posições ==> " + tempoTotal + "s");
	}
	
}
