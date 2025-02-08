public class ScoreHandler {
    private int score = 0;

    public void updateScore(int points) {
        score += points;
    }

    public int getScore() {
        return score;
    }
}