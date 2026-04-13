package Corte2.ListasEnlazadas.Reto_ListasD;

public class Vagon {
  String Id;
  String TipoCarga;
  Vagon Siguiente;
  Vagon Anterior;

  public Vagon( String Id, String TipoCarga){
    this.Id = Id;
    this.TipoCarga = TipoCarga;
    this.Siguiente = null;
    this.Anterior = null;



  }
  
}
