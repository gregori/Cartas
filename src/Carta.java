// representa uma carta do baralho
public class Carta {
	private final String face; // face da carta ("As", "Dois", "Três"...)
	private final String naipe; //  naipe da carta ("Ouros", "Copas" ...)
	
	// construtor de dois argumentos, inicializa face e naipe
	public Carta(String face, String naipe) {
		this.face = face;
		this.naipe = naipe;
	}
	
	// retorna a representação em string
	@Override
	public String toString() {
		return face + " de " + naipe;
	}
	
} // fim da classe Carta
