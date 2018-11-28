


import java.lang.reflect.Array;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Hilo_consumidor_productor extends Thread{
    private Auto auto;
    private Lista lista_coches;
    private Arreglo_estacionamiento arreglo;
    int entrada;
    
    public Hilo_consumidor_productor(Lista lista,Arreglo_estacionamiento arreglo,int num){
        this.auto=auto;
        this.lista_coches=lista;
        this.arreglo=arreglo;
        this.entrada=num;
    }
    
    public void run(){
   
        while(true){
            
               auto=lista_coches.ObtenerAuto();
               //System.out.println("Entrada "+getName());
               
               try {
                sleep(3);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo_consumidor_productor.class.getName()).log(Level.SEVERE, null, ex);
            }
               System.out.println(getName()+" entrada: "+entrada+ "\tingresando al estacionamiento:"+auto.color_auto+"\t"+auto.marca_auto+"\t"+auto.placa);
            try {
                sleep(3);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo_consumidor_productor.class.getName()).log(Level.SEVERE, null, ex);
            }
                
              arreglo.Llenar_Arreglo(auto);   
        }   
        
    
        
        
        
    }
}
