package view;

import controller.Ordena;

public class Principal {

	public static void main(String[] args) {
		Ordena or = new Ordena();
		int[] vetor = {69,68,32,36,91,19,28,44,88,73,37,99,1};
		int tamVetor = vetor.length;
		or.ordenaQuick(vetor, 0, tamVetor-1);
		for(int valor:vetor) {
			System.out.print(valor+" ");
		}
		

	}

}
