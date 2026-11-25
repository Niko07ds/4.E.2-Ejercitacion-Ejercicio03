package ejercicio03;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();

        GameScreen screen = new GameScreen();
        RecordsSystem records = new RecordsSystem();

        System.out.println("Registrando la pantalla y el sistema de récords");
        game.addScoreObserver(screen);
        game.addScoreObserver(records);

        System.out.println();
        System.out.println("El jugador destruye un obstáculo");
        game.destroyObstacle();

        System.out.println();
        System.out.println("El jugador recolecta un objeto");
        game.collectItem();

        System.out.println();
        System.out.println("Se oculta la pantalla de juego (se desuscribe)");
        game.removeScoreObserver(screen);

        System.out.println();
        System.out.println("El jugador destruye otro obstáculo (solo se registra el récord)");
        game.destroyObstacle();

        System.out.println();
        System.out.println("Se vuelve a mostrar la pantalla y el jugador recolecta otro objeto");
        game.addScoreObserver(screen);
        game.collectItem();

        System.out.println();
        System.out.println("Fin del nivel");
        records.printSummary();
    }
}
