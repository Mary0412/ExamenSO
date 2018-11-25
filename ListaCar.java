

package examen_sistemas_operativos;

public class Lista {
    public Nodo inicio,fin;
    
    public Lista(){
    inicio=null;
    fin=null;
    }
 
    public boolean estaVacia(){
    
    	if(inicio==null){
        	return true;
    
    	}else {return false;}
    
    }
        
    public void agregarFinal(String color,String marca,String placa){
		if(!estaVacia()){
                
         
                fin.siguiente=new Nodo(color,marca,placa);
                fin=fin.siguiente;
                
            }else{
                  
                  inicio=fin=new Nodo(color,marca,placa);
                   
             }
                                          
	}
    
	public void mostrarFila(){
	Nodo recorrer=inicio;
	while(recorrer!=null){
		System.out.println("color:"+recorrer.color+"\tmarca:"+recorrer.marca+"\tplaca:"+recorrer.placa);
		
                recorrer=recorrer.siguiente;
	}
        
        
	}

    
    
}
