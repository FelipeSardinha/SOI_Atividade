// Fazer uma aplica��o em Java com o Eclipse que leia um vetor de 100 posi��es,
// 1000 posi��es e 10000 posi��es, com valores de 1 a 10, itere cada vetor somando
// o conteudo dos vetores. A aplica��o deve exibir o tempo da itera��o de cada vetor.
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