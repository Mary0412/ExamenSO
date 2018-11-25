public class ListaCar{
rotected Nodo inicio,fin;

	public ListaCar(){
		inicio=null;
		fin=null;
                
	}
   
    public boolean estaVacia(){
    
    	if(inicio==null){
        	return true;
    
    	}else {return false;}
    
    }
        
    public void agregarFinal(Auto car){
		if(!estaVacia()){
                
         
                fin.siguiente=new Nodo(car);
                fin=fin.siguiente;
                
            }else{
                  
                  inicio=fin=new Nodo(car);
                   
             }
                                          
	}
    
	public void mostrarFila(){
	Nodo recorrer=inicio;
	while(recorrer!=null){
		System.out.println("Auto");
		
                recorrer=recorrer.siguiente;
	}
        
        
	}

        
    public boolean iterar(){
		if(inicio==fin && fin==null){
		return true;
	}else{return false;}}

	public void borrarAuto(){
	//int tem=fin.tamaño;
	if(inicio==fin){
		inicio=null;
		fin=null;
	}else{
		inicio=inicio.siguiente;
		/*Nodo auxiliar=inicio;
		while(auxiliar.siguiente!=fin){
			auxiliar=auxiliar.siguiente;
		}fin=auxiliar;
		fin.siguiente=null;*/
	}
      }
        
}

