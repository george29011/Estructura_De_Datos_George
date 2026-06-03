package Corte3.Arboles.Ejercicio4;

public class RankingELO {
    private Jugador raiz;

    
    public void insertar(int elo, String nombre, String pais, int partidas) {
        raiz = insertarRec(raiz, elo, nombre, pais, partidas);
    }

    private Jugador insertarRec(Jugador actual, int elo, String nombre, String pais, int partidas) {
        if (actual == null) {
            return new Jugador(elo, nombre, pais, partidas);
        }
        if (elo < actual.elo) {
            actual.izquierda = insertarRec(actual.izquierda, elo, nombre, pais, partidas);
        } else if (elo > actual.elo) {
            actual.derecha = insertarRec(actual.derecha, elo, nombre, pais, partidas);
        } else {
            System.out.println("El jugador con ELO " + elo + " ya está registrado.");
        }
        return actual;
    }

 
    public void listarEnRango(int eloMin, int eloMax) {
        System.out.println("\n--- JUGADORES EN RANGO [" + eloMin + ", " + eloMax + "] ---");
        listarRec(raiz, eloMin, eloMax);
    }

    private void listarRec(Jugador actual, int eloMin, int eloMax) {
        if (actual == null) return;

        
        if (actual.elo > eloMin) {
            listarRec(actual.izquierda, eloMin, eloMax);
        }

       
        if (actual.elo >= eloMin && actual.elo <= eloMax) {
            System.out.println(actual);
        }

      
        if (actual.elo < eloMax) {
            listarRec(actual.derecha, eloMin, eloMax);
        }
    }
}

