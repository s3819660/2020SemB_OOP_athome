/**
 * represent a board
 */
public class Board {
    /**
     * dimention by rank then file
     */
    private Piece[][] state = new Piece[8][8];

    public void makeMove(Move move) {
        Piece srcPiece = state[ofRank(move.getRankSource())][ofFile(move.getFileSource())];

        state[ofRank(move.getRankDestination())][ofFile(move.getFileDestination())] = srcPiece;

        state[ofRank(move.getRankSource())][ofFile(move.getFileSource())] = null;
    }

    /**
     * check if a position is occupied by piece
     * @param rank
     * @param file
     * @return
     */
    public boolean isOccupied(int rank, char file) {
        return state[ofRank(rank)][ofFile(file)] != null;   // equivalent to if else
    }

    /**
     * get piece at specific position
     * @param rank
     * @param file
     * @return
     */
    public Piece getPiece(int rank, char file) {
        return state[ofRank(rank)][ofFile(file)];
    }

    /**
     * create a standard boar where pieces set to initial position
     * @return
     */
    public static Board makeStandardBoard() {
        Board board = new Board();

        board.state[ofRank(1)][ofFile('a')] = new Rook(Alliance.WHITE);   // a1 white rook
        board.state[ofRank(1)][ofFile('b')] = new Knight(Alliance.WHITE); // b1 white knight
        board.state[ofRank(1)][ofFile('c')] = new Bishop(Alliance.WHITE); // c1 white bishop
        board.state[ofRank(1)][ofFile('d')] = new Queen(Alliance.WHITE);  // d1 white queen
        board.state[ofRank(1)][ofFile('e')] = new King(Alliance.WHITE);   // e1 white king
        board.state[ofRank(1)][ofFile('f')] = new Bishop(Alliance.WHITE); // f1 white bishop
        board.state[ofRank(1)][ofFile('g')] = new Knight(Alliance.WHITE); // g1 white knight
        board.state[ofRank(1)][ofFile('h')] = new Rook(Alliance.WHITE);   // h1 white rook


        board.state[ofRank(2)][ofFile('a')] = new Pawn(Alliance.WHITE);   // a2 white pawn
        board.state[ofRank(2)][ofFile('b')] = new Pawn(Alliance.WHITE); // b2 white pawn
        board.state[ofRank(2)][ofFile('c')] = new Pawn(Alliance.WHITE); // c2 white pawn
        board.state[ofRank(2)][ofFile('d')] = new Pawn(Alliance.WHITE);  // d2 white pawn
        board.state[ofRank(2)][ofFile('e')] = new Pawn(Alliance.WHITE);   // e2 white pawn
        board.state[ofRank(2)][ofFile('f')] = new Pawn(Alliance.WHITE); // f2 white pawn
        board.state[ofRank(2)][ofFile('g')] = new Pawn(Alliance.WHITE); // g2 white pawn
        board.state[ofRank(2)][ofFile('h')] = new Pawn(Alliance.WHITE);   // h2 white pawn


        board.state[ofRank(8)][ofFile('a')] = new Rook(Alliance.BLACK);   // a8 black rook
        board.state[ofRank(8)][ofFile('b')] = new Knight(Alliance.BLACK); // b8 black knight
        board.state[ofRank(8)][ofFile('c')] = new Bishop(Alliance.BLACK); // c8 black bishop
        board.state[ofRank(8)][ofFile('d')] = new Queen(Alliance.BLACK);  // d8 black queen
        board.state[ofRank(8)][ofFile('e')] = new King(Alliance.BLACK);   // e8 black king
        board.state[ofRank(8)][ofFile('f')] = new Bishop(Alliance.BLACK); // f8 black bishop
        board.state[ofRank(8)][ofFile('g')] = new Knight(Alliance.BLACK); // g8 black knight
        board.state[ofRank(8)][ofFile('h')] = new Rook(Alliance.BLACK);   // h8 black rook


        board.state[ofRank(7)][ofFile('a')] = new Pawn(Alliance.BLACK);   // a2 black pawn
        board.state[ofRank(7)][ofFile('b')] = new Pawn(Alliance.BLACK);   // b2 black pawn
        board.state[ofRank(7)][ofFile('c')] = new Pawn(Alliance.BLACK);   // c2 black pawn
        board.state[ofRank(7)][ofFile('d')] = new Pawn(Alliance.BLACK);   // d2 black pawn
        board.state[ofRank(7)][ofFile('e')] = new Pawn(Alliance.BLACK);   // e2 black pawn
        board.state[ofRank(7)][ofFile('f')] = new Pawn(Alliance.BLACK);   // f2 black pawn
        board.state[ofRank(7)][ofFile('g')] = new Pawn(Alliance.BLACK);   // g2 black pawn
        board.state[ofRank(7)][ofFile('h')] = new Pawn(Alliance.BLACK);   // h2 black pawn


        return board;
    }

    private static int ofFile(char file) {
        return file - 'a';
    }   // return index

    private static int ofRank(int rank) {                         // return index
        return 8-rank;
    }
}
