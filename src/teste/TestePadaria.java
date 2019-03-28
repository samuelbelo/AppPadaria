package teste;

import java.util.ArrayList;
import java.util.List;

import negocio.Bolo;
import negocio.Padaria;
import negocio.Padeiro;
import negocio.Pao;
import negocio.Produto;
public class TestePadaria {

	public static void main(String[] args) {
		Bolo b = new Bolo();
		Pao p = new Pao();
		
		List<Produto> produtos = new ArrayList<Produto>();
		produtos.add(b);
		produtos.add(p);
		
		Padeiro padeiro = new Padeiro();
		padeiro.exibir();
		
		Padaria padaria = new Padaria();
		padaria.produto = produtos;
		padaria.padeiro = padeiro;
		padaria.exibir();

	}

}
