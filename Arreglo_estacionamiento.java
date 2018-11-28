


import static java.lang.Math.random;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Arreglo_estacionamiento {
    //ArrayList arreglo=new ArrayList(10);
   //Auto auxiliar=new Auto();
    Auto array[]=new Auto[10];//creando array de objetos
    String hilo;
    boolean disponible=true;
    int espacio=10,num_hilo;
    int contador=0,insertar;
    int aleatorio;
    boolean validar;
    Random random=new Random();
    
    
    public synchronized boolean Llenar_Arreglo(Auto auto){
        
        while(disponible==false){//no se ha consumido un valor
                try {
                wait(); //se pone a dormir y cede el monitor
                } catch (InterruptedException e) {}
        }
        
       //array.length
            if(contador<=9){ 
                 //System.out.println("contadorciiiin:"+contador);
                 espacio=espacio-1;
                 System.out.println("\nEspacios disponibles "+espacio);
                 insertar=(int) Math.floor(Math.random() * 9);  
                 while(array[insertar]!=null){
                    insertar=(int) Math.floor(Math.random() * 9);  
                 }
                  
                 
                 array[insertar]=(Auto)auto; 
                contador=contador+1;
                
                 disponible=true;
            
             Imprimir_estacionamiento();}
            else{
                disponible=false;
                System.out.println("-----ESTACIONAMIENTO LLENO-----"+contador);
                 /*for(int a=0;a<contador;a++){
               
                if(array[a]!=null){
                System.out.println("LUGAR OCUPADOPERO LLENO------"+array[a].color_auto+"\t"+array[a].marca_auto+"\t"+array[a].placa);}
            } */
                        Imprimir_estacionamiento();
            }
            
             
            //ya hay un valor
           
          notifyAll();
           return disponible;
           
          
    }
    
    public void Imprimir_estacionamiento(){
    
    for(int a=0;a<array.length;a++){
               int temp=contador-1;
                if(array[a]!=null){
                System.out.println("LUGAR:"+a+"\tLUGAR OCUPADO------"+array[a].color_auto+"\t"+array[a].marca_auto+"\t"+array[a].placa);}
            }
            
    
    }
 
    public synchronized void Eliminar_estacionamiento(int num,String hilo){
       Auto carro=new Auto();
      this.num_hilo=num;
      this.hilo=hilo;
      aleatorio=(int) Math.floor(Math.random() * 9);   
        
       while(espacio==10){
            try {
                wait(); //se pone a dormir y cede el monitor
                } catch (InterruptedException e) {}
          } 
       carro=array[aleatorio];
     
       if(carro!=null){
       
            array[aleatorio]=null;
            disponible=true;
            espacio=espacio+1;
            contador=contador-1;

            System.out.println("\nHilo "+hilo+" salida "+num_hilo);  
            System.out.println("\tCOCHE SALIENDO---->-->--> "+carro.color_auto+"\t"+carro.marca_auto+"\t"+carro.placa);
           Imprimir_estacionamiento();
          
       
     }
     
       // disponible=false;
        notifyAll();
      
        }
        
    
       
   }
    
    

