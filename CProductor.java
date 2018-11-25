class CProductor extends Thread {
		
		private Auto []entradauto //último mensaje producido
		public CProductor (Auto c) {
		entradauto=c;
		}
		public void run() {

		while (true) {
			nMsj = (int)(Math.random()*100); //genera num. de msj
		mensaje.Almacenar(nMsj); //almaena el mensaje
		System.out.println("Productor "+ getName() + "almacena el mensaje #" + nMsj);
		/*try {sleep(2);
			//sleep((int)(Math.random()*100));
		} catch (InterruptedException e) {}*/
		}
		}
}
