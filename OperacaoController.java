package controller;

import br.edu.fateczl.filaobj.Fila;

public class OperacaoController {

	public void caixa(Fila f) {
		
		for (int i = 1; i < 21; i ++) {
			int quant = 0;
			float valor = 0;
			
			try {
				System.out.println("Cliente: " +f.remove());
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			try {
				quant = (int) f.remove();
			} catch (Exception e) {
				e.printStackTrace();
			}

			try {
				valor = (float) f.remove();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			System.out.println("Valor total da compra: R$" +(quant*valor));
		}
		
	}
}
