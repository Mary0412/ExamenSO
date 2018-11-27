
package examen_sistemas_operativos;

public class Hilo_consumidor extends Thread{
    private Auto auto;
    private Lista lista_coches;
    
    
    public Hilo_consumidor(Lista lista){
        this.auto=auto;
        this.lista_coches=lista;
    
    }
    
    
    
    public void run(){
    
        while(true){
               auto=lista_coches.ObtenerAuto();
              
               System.out.println("hilo:"+getName()+"ingresando al estacionamiento:"+auto.color_auto+"\t"+auto.marca_auto+"\t"+auto.placa);
        
        }
    
        
        
        
    }
}
