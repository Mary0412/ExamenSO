package examen_sistemas_operativos;

import java.util.*;

public class Examen_sistemas_operativos {
public static void main(String[] args){
		int entradas;
        int salidas;
        Auto salida;
       // Scanner num_entradas=new Scanner(System.in);
        //Scanner num_salidas=new Scanner(System.in);
        ListaCar lista_coches=new ListaCar();
        CProductor productor1 = new CProductor(lista_coches);
       /*Auto auto=new Auto();
       Auto auto2=new Auto();
//        System.out.println("color1:"+auto.color_auto+"\tmarca:"+auto.marca_auto+"\tplacas:"+auto.placa);
//        System.out.println("color2:"+auto2.color_auto+"\tmarca:"+auto2.marca_auto+"\tplacas:"+auto2.placa);
//        
////        System.out.println("ingrese el numero de entradas del estacionanmiento:");
////        entradas=num_entradas.nextInt();
////        System.out.println("entradas:"+entradas);
////        
////         System.out.println("ingrese el numero de salidas del estacionanmiento:");
////        salidas=num_salidas.nextInt();
////        System.out.println("salidas:"+salidas);
        
       lista_coches.agregarFinal(auto.color_auto,auto.marca_auto,auto.placa);
       lista_coches.agregarFinal(auto2.color_auto,auto2.marca_auto,auto2.placa);
       lista_coches.mostrarFila();
       System.out.println("Agregando mas");
       for(int i=0;i<4;i++){
       	Auto car=new Auto();
       	lista_coches.agregarFinal(car.color_auto,car.marca_auto,car.placa);
      
       }*/
       	productor1.start();
       	try{
			
			productor1.join();
		}catch(InterruptedException ex){}
       	System.out.println("\n\nEn la entrada 1: ");
        lista_coches.mostrarFila();
        salida = lista_coches.borrarAuto();
          System.out.println("\n\nEn la entrada 1: ");
        lista_coches.mostrarFila();

	}
    
}
