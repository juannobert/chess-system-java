package boardgame;

public class Piece {

	/*
	 * Os atributos são protected pois não queremos que eles 
	 * sejam acessados dentro do jogo de xadrez
	 */
	
	protected Position position;
	
	private Board board;

	protected Board getBoard() {
		return board;
	}
	
	
	
	
	
}
