/**
 * represent a move
 */
public class Move {
    /**
     * rank of source
     */
    private int rankSource;

    /**
     * file of source
     */
    private char fileSource;

    /**
     * rank of destination
     */
    private int rankDestination;

    /**
     * file of destination
     */
    private char fileDestination;

    /**
     * constructor
     * @param rankSource rank of source
     * @param fileSource file of source
     * @param rankDestination rank of destination
     * @param fileDestination file of destination
     */
    public Move(int rankSource, char fileSource, int rankDestination, char fileDestination) {
        this.rankSource = rankSource;
        this.fileSource = fileSource;

        this.rankDestination = rankDestination;
        this.fileDestination = fileDestination;
    }

    @Override
    public String toString() {
        return String.format("source{%d, %c}, destination{%d, %c}", rankSource, fileSource, rankDestination, fileDestination);
    }

    public char getFileDestination() {
        return fileDestination;
    }

    public char getFileSource() {
        return fileSource;
    }

    public int getRankDestination() {
        return rankDestination;
    }

    public int getRankSource() {
        return rankSource;
    }
}
