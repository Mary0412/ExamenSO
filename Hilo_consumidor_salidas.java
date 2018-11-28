


import java.util.logging.Level;
import java.util.logging.Logger;

public class Hilo_consumidor_salidas extends Thread {
   private Auto auto;
   private boolean disponible;
   private Arreglo_estacionamiento arreglo;
   int num_hilo;
    
    public Hilo_consumidor_salidas(Arreglo_estacionamiento arreglo,int num){
        this.arreglo=arreglo;
        this.auto=auto;
        this.num_hilo=num;
}
    
    
    public void run(){
    
        while(true){
            try {
                sleep(4);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo_consumidor_salidas.class.getName()).log(Level.SEVERE, null, ex);
            }
            
             arreglo.Eliminar_estacionamiento(num_hilo,getName());
        }
          
          }
         
           }
        
    
    
    

