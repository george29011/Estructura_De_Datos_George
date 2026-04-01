package Tema_3;

public class Ejercicio_13 {

  public class ArbolResiduos {

    
    static class NodoResiduo {
        String nombre;
        NodoResiduo izquierdo;
        NodoResiduo derecho;

        public NodoResiduo(String nombre) {
            this.nombre = nombre;
            this.izquierdo = null;
            this.derecho = null;
        }
    }

    public static void main(String[] args) {

       
        NodoResiduo raiz = new NodoResiduo("Residuos");
        NodoResiduo organicos = new NodoResiduo("Orgánicos");
        NodoResiduo inorganicos = new NodoResiduo("Inorgánicos");
        NodoResiduo comida = new NodoResiduo("Comida");
        NodoResiduo jardin = new NodoResiduo("Jardín");
        NodoResiduo plastico = new NodoResiduo("Plástico");
        NodoResiduo papel = new NodoResiduo("Papel");

       
        raiz.izquierdo = organicos;
        raiz.derecho = inorganicos;

        organicos.izquierdo = comida;
        organicos.derecho = jardin;

        inorganicos.izquierdo = plastico;
        inorganicos.derecho = papel;

       
        imprimirArbol(raiz, 0);
    }

    
    public static void imprimirArbol(NodoResiduo nodo, int nivel) {
        if (nodo != null) {
            System.out.println("Nivel " + nivel + ": " + nodo.nombre);
            imprimirArbol(nodo.izquierdo, nivel + 1);
            imprimirArbol(nodo.derecho, nivel + 1);
        }
    }
}
}
