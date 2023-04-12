package view;
import br.edu.fateczl.filaobj.Fila;
import model.Cliente;
import controller.OperacaoController;

public class Main {

	public static void main(String[] args) {
		Fila f = new Fila();
		int i = 0;
		
		for (i = 1; i < 21; i ++) {
			Cliente c1 = new Cliente();
			c1.nome = "Cliente" + i;
			f.insert(c1.nome);
			c1.quantPecas = (int) (Math.random()*30.3 + 20);
			f.insert(c1.quantPecas);
			c1.valorPecas = (float) (Math.random()*95.96 + 5);
			f.insert(c1.valorPecas);
		}
		
		OperacaoController op = new OperacaoController();
		op.caixa(f);
		
	}

}
