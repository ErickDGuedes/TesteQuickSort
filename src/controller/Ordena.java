package controller;
import ordenacaoquick.*;
public class Ordena {
	
	public Ordena() {
		super();
	}
	
	public void ordenaQuick(int[] vetor, int i,int j) {
		QuickSort quick = new QuickSort();
		quick.quickSort(vetor, i, j);
		
	}

}
