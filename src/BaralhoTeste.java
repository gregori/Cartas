
public class BaralhoTeste {

	public static void main(String[] args) {
		Baralho meuBaralho  = new Baralho();
		
		meuBaralho.embaralha(); // coloca as cartas de forma aleatória
		
		// imprime as 52 cartas, na ordem em que elas estão no baralho
		for (int i = 1; i <= 52; i++) {
			System.out.printf("%-19s", meuBaralho.distribuiCarta());
			
			if (i % 4 == 0) // gera uma linha em branco a cada 4 cartas
				System.out.println();
		}

	}

}
