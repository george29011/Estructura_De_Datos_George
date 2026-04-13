package Corte2.ListasEnlazadas.Reto_ListasD;

public class ListaD {
  Vagon Cabeza;
  Vagon Cola;

    public ListaD(){

      Cabeza = null;
      Cola = null;
    }
public ListaD dividirTren( String VagonId){

  Vagon actual = Cabeza;
  while ( actual != null && !actual.Id.equals(VagonId)) {
    actual = actual.Siguiente;
  }
  if (actual == null) {
    return null;
    
  }
  ListaD nuevaListaD = new ListaD();
  nuevaListaD.Cabeza = actual; 
  nuevaListaD.Cola = Cola;

  if (actual == Cabeza){
    Cabeza = null; 
    Cola = null;
    return nuevaListaD;

  }
  Vagon Anterior = actual.Anterior;
  Anterior.Siguiente = null;
  actual.Anterior = null;
  Cola = Anterior; 
  return nuevaListaD;
}

}
