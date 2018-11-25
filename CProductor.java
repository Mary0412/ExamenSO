class CProductor extends Thread {
		
		public CProductor (CMensaje c) {
		Auto car=new Auto();
		}
		public void run() {
		int nMsj;
//numero de mensaje
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
