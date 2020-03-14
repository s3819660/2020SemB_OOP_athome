public class Game {
    public static void draw(Board board) {

        System.out.println("  a  b  c  d  e  f  g  h");
        for(int rank = 8; rank >= 1; rank--) {
            System.out.printf("%d ", rank);
            for(char file = 'a'; file <= 'h'; file++) {
                if(board.isOccupied(rank, file)) {
                    System.out.printf("%s ", board.getPiece(rank, file));
                }
                else {
                    System.out.print("-- ");
                }
            }
            System.out.printf("%d\n", rank);
        }
        System.out.println("  a  b  c  d  e  f  g  h");

    }

    public static void main(String[] args) {

        Player whitePlayer = new Player(Alliance.WHITE);

        Player blackPlayer = new Player(Alliance.BLACK);

        Board board = Board.makeStandardBoard();

        draw(board);

        int count= 0;

        while(true) {

            Move move;

            if(count % 2 == 0) {
                move = whitePlayer.nextMove();
            }
            else {
                move = blackPlayer.nextMove();
            }

            board.makeMove(move);

            draw(board);

            count++;

        }
    }
}
