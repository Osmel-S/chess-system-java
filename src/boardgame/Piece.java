package boardgame;

public abstract class  Piece {
	
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
	
	public abstract boolean[][] possibleMoves();
	
	//abaixo temos dois exemplos de duas implementacoes concretas
	//que dependem de um metodo abstrato
	//Rook metodo,faz um gancho com a subclasse
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for(int i=0; i < mat.length; i++) {
			for(int j=0; j < mat.length; j++) {
				if(mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
	
}
