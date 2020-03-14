public class King extends Piece {
    public King(Alliance alliance) {
        super(alliance);
    }

    @Override
    public String toString() {
        return String.format("%sK", alliance == Alliance.WHITE ? "W" : "B");
    }
}
