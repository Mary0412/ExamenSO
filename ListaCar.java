ublic class ListaCar{
protected Nodo inicio,fin;
int tiempo,id,tamaño;
	public ListaCar(){
		inicio=null;
		fin=null;
	}

	public void agregar(int id,int tiempo,int tamano){
		inicio=new Nodo(id,tiempo,tamano,inicio);
		if(fin==null){
			fin=inicio;
		}
	}

	public void mostrarLista(){
	Nodo recorrer=inicio;
	while(recorrer!=null){
		System.out.print("[ID PROCESO:"+recorrer.id+" TIEMPO DE LLEGADA:"+recorrer.tiempo+"[ms] "+"TAMAÑO:"+recorrer.tamaño+"[MB]]--->");
		recorrer=recorrer.siguiente;
	}
	}

	public void borrarProceso(){
	 this.tamaño=fin.tamaño;
	this.id=fin.id;
	this.tiempo=fin.tiempo;
	if(inicio==fin){
		inicio=null;
		fin=null;
	}else{
		Nodo auxiliar=inicio;
		while(auxiliar.siguiente!=fin){
			auxiliar=auxiliar.siguiente;
		}fin=auxiliar;
		fin.siguiente=null;
	}
	
	
	}


	public int getTamaño(){
	 return tamaño;
	
	}

	public int getTiempo(){
	 return tiempo;
	
	}

	public int getId(){
	 return id;
	
	}


}
