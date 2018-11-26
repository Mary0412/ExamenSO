

package examen_sistemas_operativos;

public class Nodo {
    
    String color,marca,placa;
    Auto coche;
    Nodo nodo;
    Nodo anterior;
    Nodo siguiente; //enlaza los nodos (simplemente enlazados)
    Nodo cabeza; //(apunta al final de la lista para ir agregando los nodos) 
    
    
   public Nodo(Auto c){
        /*this.color=color;
                this.marca=marca;
                this.placa=placa;*/
                coche=c;
        this.siguiente=null;
                
}

}
