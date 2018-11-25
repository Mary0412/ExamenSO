public class Nodo {
    
    
    Auto carrito;
    Nodo nodo;
    Nodo anterior;
    Nodo siguiente; //enlaza los nodos (simplemente enlazados)
    Nodo cabeza; //(apunta al final de la lista para ir agregando los nodos) 
    
   public Nodo(Auto carr){
		carrito=carr;
		this.siguiente=null;
                
		}
    
//   public  void setIdproceso(int id_proceso){
//		this.id_proceso=id_proceso;
//                this.siguiente=null; //cuando regrese nulo es que no hay otro nodo enlazado 
//    }
   
    
    
    
}
