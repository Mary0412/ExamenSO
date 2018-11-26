
package examen_sistemas_operativos;

public class ListaCar{
         
	public Nodo inicio,fin;
    
    public ListaCar(){
    inicio=null;
    fin=null;
    }
 
    public boolean estaVacia(){
    
    	if(inicio==null){
        	return true;
    
    	}else {return false;}
    
    }
        
    public void agregarFinal(Auto c){
		if(!estaVacia()){
                
         
                fin.siguiente=new Nodo(c);
                fin=fin.siguiente;
                
            }else{
                  
                  inicio=fin=new Nodo(c);
                   
             }
                                          
	}
    
	public void mostrarFila(){
	Nodo recorrer=inicio;
	while(recorrer!=null){
        System.out.println("color:"+recorrer.coche.color_auto+"\tmarca:"+recorrer.coche.marca_auto+"\tplaca:"+recorrer.coche.placa);
		//System.out.println("color:"+recorrer.color+"\tmarca:"+recorrer.marca+"\tplaca:"+recorrer.placa);
		
                recorrer=recorrer.siguiente;
	}
        
        
	}



      public Auto borrarAuto(){
    Auto tem=inicio.coche;
    if(inicio==fin){
        inicio=null;
        fin=null;
    }else{
        inicio=inicio.siguiente;
        /*Nodo auxiliar=inicio2;
        while(auxiliar.siguiente2!=fin2){
            auxiliar=auxiliar.siguiente2;
        }fin2=auxiliar;
        fin2.siguiente2=null;*/
    }
        return tem;
      }

	
        
}
