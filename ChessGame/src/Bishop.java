public class Bishop extends Piece {
    public Bishop(Alliance alliance) {
        super(alliance);
    }

    @Override
    public String toString() {
        return String.format("%sB", alliance == Alliance.WHITE ? "W" : "B");
    }
}
