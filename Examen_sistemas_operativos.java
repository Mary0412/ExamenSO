


import java.lang.reflect.Array;
import java.util.*;

public class Examen_sistemas_operativos {

    public static void main(String[] args) throws InterruptedException {
        
        int entradas;
        int salidas;
        int capacidad;
        int num_autos;
        //Array[] arreglo_estacionamiento=new Array[10];
        Auto salida;
        Scanner num_entradas=new Scanner(System.in);
        //Scanner num_salidas=new Scanner(System.in);
        Scanner capacidad_estacionamiento=new Scanner(System.in);
        //Scanner numero_autos=new Scanner (System.in);
        Lista lista_coches;
            
                Arreglo_estacionamiento arreglo=new Arreglo_estacionamiento();
                
                lista_coches=new Lista();
                
                
                Hilo_productor productor_coches = new Hilo_productor(lista_coches);
                 productor_coches.start();
               
                for(int a=0;a<3;a++){
                Hilo_consumidor_productor consumidor_coches1=new Hilo_consumidor_productor(lista_coches,arreglo,a+1);
               
                consumidor_coches1.start();}
               
                
              for(int b=0;b<2;b++){ 
                Hilo_consumidor_salidas consumidor_salida=new Hilo_consumidor_salidas(arreglo,b+1);
                
                consumidor_salida.start();
               
              }              
               
	}
   
    }
    

