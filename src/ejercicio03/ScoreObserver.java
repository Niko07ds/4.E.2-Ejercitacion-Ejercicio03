package ejercicio03;

/**
 * Interfaz común de los componentes que reaccionan a un cambio de puntuación.
 */
public interface ScoreObserver {

    void onScoreChanged(int score);
}
