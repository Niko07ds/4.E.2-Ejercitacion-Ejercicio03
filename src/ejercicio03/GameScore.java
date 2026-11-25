package ejercicio03;

import java.util.ArrayList;
import java.util.List;

/**
 * Puntuación acumulada del jugador (sujeto observable).
 * No conoce ninguna clase de pantalla ni de récords.
 */
public class GameScore {

    private int total;
    private final List<ScoreObserver> observers = new ArrayList<>();

    public void addObserver(ScoreObserver observer) {
        if (observer != null && !observers.contains(observer)) {
            observers.add(observer);
        }
    }

    public void removeObserver(ScoreObserver observer) {
        observers.remove(observer);
    }

    public void addPoints(int points) {
        if (points <= 0) {
            throw new IllegalArgumentException("Los puntos a sumar deben ser mayores a cero");
        }
        total += points;
        for (ScoreObserver observer : new ArrayList<>(observers)) {
            observer.onScoreChanged(total);
        }
    }

    public int getTotal() {
        return total;
    }
}
