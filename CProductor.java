class CProductor extends Thread {
	private ListaCar listacar; //último mensaje producido
		String modelo,color;
		public CProductor (ListaCar carritos) {
			listacar=carritos;
		}
		/*public void setCar(){
			this.modelo="Nissan";
			this.color="azul";
		}*/
		public void run() {
			int i=1;
		while (i<=5) {
			//synchronized(listacar){
				
				Auto car=new Auto();
       			listacar.agregarFinal(car.color_auto,car.marca_auto,car.placa);
				
				System.out.println("Productor "+ getName() + " almacena el carro #" + i+"\ncolor:"+car.color_auto+"\tmarca:"+car.marca_auto+"\tplaca:"+car.placa);
				try {sleep(2);
			//sleep((int)(Math.random()*100));
				} catch (InterruptedException e) {}
				i++;
			}
			/*System.out.println("Entrada 1:");
			listacar.mostrarFila();*/
		}	
	
}
