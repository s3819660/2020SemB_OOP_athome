public class Queen extends Piece {
    public Queen(Alliance alliance) {
        super(alliance);
    }

    @Override
    public String toString() {
        return String.format("%cQ", alliance == Alliance.WHITE ? 'W' : 'B');
    }
}
