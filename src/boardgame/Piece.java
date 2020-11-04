package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	
	public Piece( Board board) {
		this.board = board;
		position = null; //(opcional,por padrao java ja joga valor nulo)
	}
	//posicao de uma piece recem criada vai ser nula
	
	protected Board getBoard() {
		return board;
	}



	
}
