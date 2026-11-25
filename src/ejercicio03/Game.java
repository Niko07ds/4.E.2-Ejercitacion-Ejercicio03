package ejercicio03;

/**
 * Lógica del juego. Solo suma puntos; no llama a clases de pantalla ni de persistencia.
 */
public class Game {

    private static final int OBSTACLE_POINTS = 10;
    private static final int ITEM_POINTS = 25;

    private final GameScore score = new GameScore();

    public void destroyObstacle() {
        score.addPoints(OBSTACLE_POINTS);
    }

    public void collectItem() {
        score.addPoints(ITEM_POINTS);
    }

    public void addScoreObserver(ScoreObserver observer) {
        score.addObserver(observer);
    }

    public void removeScoreObserver(ScoreObserver observer) {
        score.removeObserver(observer);
    }
}
