
package examen_sistemas_operativos;

import java.util.*;

public class Examen_sistemas_operativos {

    public static void main(String[] args) throws InterruptedException {
        
        int entradas;
        int salidas;
        int capacidad;
        int num_autos;
        Auto salida;
        Scanner num_entradas=new Scanner(System.in);
        Scanner num_salidas=new Scanner(System.in);
        Scanner capacidad_estacionamiento=new Scanner(System.in);
        Scanner numero_autos=new Scanner (System.in);
        Lista lista_coches;
        System.out.println("ingrese el numero de autos que desea generar:");
        num_autos=numero_autos.nextInt();
//        
//        System.out.println("ingrese la capacidad de coches que tiene el estacionamiento:");
//        capacidad=capacidad_estacionamiento.nextInt();
//        System.out.println("capacidad:"+capacidad);
//        Lista lista_estacionamiento=new Lista();
//        
//        System.out.println("ingrese el numero de entradas del estacionanmiento:");
//        entradas=num_entradas.nextInt();
//        System.out.println("entradas:"+entradas);
//        
//         System.out.println("ingrese el numero de salidas del estacionanmiento:");
//        salidas=num_salidas.nextInt();
//        System.out.println("salidas:"+salidas);

                lista_coches=new Lista();
                Hilo_productor productor_coches = new Hilo_productor(lista_coches,num_autos);
                Hilo_consumidor consumidor_coches=new Hilo_consumidor(lista_coches);
                 productor_coches.start();
                 consumidor_coches.start();
               productor_coches.join();
               
               lista_coches.mostrarFila();
               
           
	}
    }
    

