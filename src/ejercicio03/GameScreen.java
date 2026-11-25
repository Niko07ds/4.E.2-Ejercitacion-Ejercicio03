package ejercicio03;

/**
 * Pantalla principal del juego en consola.
 */
public class GameScreen implements ScoreObserver {

    @Override
    public void onScoreChanged(int score) {
        System.out.println("Pantalla de juego: PUNTOS = " + score);
    }
}
