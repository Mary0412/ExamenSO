class CProductor extends Thread {
		
		private ListaCar listacar; //último mensaje producido
		String modelo,color;
		public CProductor () {
		
		}
		public void setCar(){
			this.modelo="Nissan";
			this.color="azul";
		}
		public void run() {

		while (true) {
			synchronized(listacar){
				Auto car=Auto(marca,color);
				listacar.agregarFinal(car);
				System.out.println("Productor "+ getName() + "almacena el mensaje #" + nMsj);
				try {sleep(2);
			//sleep((int)(Math.random()*100));
				} catch (InterruptedException e) {}
			}
		}
}
