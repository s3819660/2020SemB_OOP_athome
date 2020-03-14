public class Rook extends Piece {

    public Rook(Alliance alliance) {
        super(alliance);
    }

    @Override
    public String toString() {
        return String.format("%cR", alliance == Alliance.WHITE ? 'W' : 'B');
    }
}
