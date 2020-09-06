// Fazer uma aplicação em Java com o Eclipse que leia um vetor de 100 posições,
// 1000 posições e 10000 posições, com valores de 1 a 10, itere cada vetor somando
// o conteudo dos vetores. A aplicação deve exibir o tempo da iteração de cada vetor.
// Responder com os 3 tempos.

package view;

import controller.OperacoesController;

public class Principal {
	
	public static void main(String[] args) {
		
		OperacoesController op = new OperacoesController();
		op.randCem();
		op.randMil();
		op.randDmil();
		
	}

}