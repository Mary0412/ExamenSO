public class ListaCar{
protected Auto inicio,fin;

	public ListaCar(){
		inicio=null;
		fin=null;
                
	}
//
//	public void agregar(int id,int tiempo,int tamano,int tiempo_ejecucion){
//		inicio=new Nodo(id,tiempo,tamano,inicio,tiempo_ejecucion);
//		if(fin==null){
//			fin=inicio;
//		}
//                
//                
//	}
//        
//      
         public boolean estaVacia(){
    
    if(inicio==null){
        return true;
    
    }else {return false;}
    
    }
        
         public void agregarFinal(int id,int tiempo,int tamano,int tiempo_ejecucion){
		if(!estaVacia()){
                
         
                    fin.siguiente=new Nodo(id,tiempo,tamano,inicio,tiempo_ejecucion);
                    fin=fin.siguiente;
                
                }else{
                            inicio=fin=new Nodo(id,tiempo,tamano,inicio,tiempo_ejecucion);
                
                
                }
                
                
                
	}
    
	public void mostrarFila(){
	Auto recorrer=inicio;
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

