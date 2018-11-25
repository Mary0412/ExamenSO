package examen_sistemas_operativos;

import java.util.*;

public class Examen_sistemas_operativos {

    public static void main(String[] args) {
        
        int entradas;
        int salidas;
        Scanner num_entradas=new Scanner(System.in);
        Scanner num_salidas=new Scanner(System.in);
        Lista lista_coches=new Lista();
       Auto auto=new Auto();
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
    }
    
}
