package negocio;

import java.util.ArrayList;
import java.util.List;

public class Padaria {
	public Padeiro padeiro;
	public List<Produto> produto = new ArrayList<Produto>();
	

	
	public void exibir() {
		
		System.out.print("Padaria\n");	
		this.padeiro.exibir();
		//this.produto.exibir();
		
		for (Produto produto : this.produto) {
			produto.exibir();
		}
	}
}
