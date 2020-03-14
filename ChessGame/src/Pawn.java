public class Pawn extends Piece {
    public Pawn(Alliance alliance) {
        super(alliance);
    }

    @Override
    public String toString() {
        return String.format("%cP", alliance == Alliance.WHITE ? 'W' : 'B');
    }
}
