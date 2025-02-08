public class main {
    public static void main(String[] args) {
        // Ұпайларды басқару
        ScoreHandler scoreHandler = new ScoreHandler();
        ScorePresenter scorePresenter = new ScorePresenter();

        scoreHandler.updateScore(10);
        scorePresenter.presentScore(scoreHandler.getScore());

        // Жау басқару
        AdversaryManager adversaryManager = new AdversaryManager();
        Adversary ghoul = new Ghoul();
        Adversary martian = new Martian();

        adversaryManager.spawnAdversary(ghoul);
        adversaryManager.spawnAdversary(martian);

        adversaryManager.removeAdversary(ghoul);
    }
}
