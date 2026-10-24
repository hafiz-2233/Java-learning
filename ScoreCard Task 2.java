
class ScoreCard {
    private int score;
    // Constructor to initialize score
    public ScoreCard(int score) {
        this.score = score;
    }

    public void addPoints(int points) {
        score += points;
    }

    // Return the score
    public int getScore() {
        return score;
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {

        ScoreCard first = new ScoreCard(10);
        ScoreCard alias = first;
        alias.addPoints(5);

        ScoreCard separate = new ScoreCard(first.getScore());
        separate.addPoints(2);
        first = new ScoreCard(1);

        System.out.println(
                first.getScore() + " " +
                        alias.getScore() + " " +
                        separate.getScore()
        );
    }
}
