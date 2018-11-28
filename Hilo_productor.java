


import java.util.logging.Level;
import java.util.logging.Logger;

public class Hilo_productor extends Thread {
    
	private Lista lista_coches; 
		String modelo,color;
                int numero_autos;
                int i=0;
		public Hilo_productor (Lista carros) {
			lista_coches=carros;
                       
                        this.i=i;
		}
		
		public void run() {
               
                        while(true){
				Auto carro=new Auto();
                            try {
                                sleep(5);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Hilo_productor.class.getName()).log(Level.SEVERE, null, ex);
                            }
                                lista_coches.agregarFinal(carro);
                              
                               System.out.println("hilo: "+getName()+"\tcarro formado:"+carro.color_auto+"\t"+carro.marca_auto+"\t"+carro.placa);
                        }

                        
                        
                      
}
}
