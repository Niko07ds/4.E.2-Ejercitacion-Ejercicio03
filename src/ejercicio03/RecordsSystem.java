package ejercicio03;

import java.util.ArrayList;
import java.util.List;

/**
 * Sistema de récords: guarda cada puntaje recibido en un historial.
 */
public class RecordsSystem implements ScoreObserver {

    private final List<Integer> history = new ArrayList<>();

    @Override
    public void onScoreChanged(int score) {
        history.add(score);
        System.out.println("Sistema de récords: puntaje " + score + " guardado en el historial");
    }

    public void printSummary() {
        int best = history.stream().mapToInt(Integer::intValue).max().orElse(0);
        System.out.println("Historial de récords: " + history + " | máximo: " + best);
    }
}
