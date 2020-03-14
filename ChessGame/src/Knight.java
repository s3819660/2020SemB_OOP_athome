public class Knight extends  Piece {
    public Knight(Alliance alliance) {
        super(alliance);
    }

    @Override
    public String toString() {
        return String.format("%cN", alliance == Alliance.WHITE ? 'W' : 'B');
    }
}
