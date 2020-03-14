import javax.swing.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * represent a player
 */
public class Player {

    /**
     * alliance
     */
    private Alliance alliance;

    public Player(Alliance alliance) {
        this.alliance = alliance;
    }

    /**
     * read a move from console
     * @return
     */
    public Move nextMove() {
        if(alliance == Alliance.WHITE) {
            System.out.printf("White ");
        }
        else {
            System.out.printf("Black ");
        }
        System.out.printf("give me a move: ");
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();  // a3 b7

        String regexStr = "(?<source>[a-h][1-8])\\s+(?<destination>[a-h][1-8])";

        Pattern pattern = Pattern.compile(regexStr);

        Matcher matcher = pattern.matcher(input);

        if(!matcher.find()) {
            System.out.println("Wrong input");

            return null;
        }

        char sourceFile = matcher.group("source").charAt(0);
        int sourceRank = matcher.group("source").charAt(1) - 48;

        char destinationFile = matcher.group("destination").charAt(0);
        int destinationRank = matcher.group("destination").charAt(1) - 48;

        return new Move(sourceRank, sourceFile, destinationRank, destinationFile);
    }

    /**
     * test move
     * @param args
     */
    public static void main(String[] args) {
        Player player = new Player(Alliance.WHITE);

        Move move = player.nextMove();

        System.out.println(move);
    }
}
