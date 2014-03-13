package edu.upc.eetac.dsa.mdelgado.ejerciciosesenciales8al11;

public class CuentaAtras10 implements Runnable {

	String ID = "";
	int contador = 0;
	int i=0;
	Thread t;
	
	public CuentaAtras10 (String iden, int num){
		this.ID = iden;
		this.contador = num;
		t = new Thread(this, ID);
		t.start();
	}
	
	public void run(){
		
		for(i=contador; i>=0 ;i--){
			try {
				this.contador=i;
				System.out.println("Num: " + this.ID + " : " + this.contador + " Ultimo: " + ejercicio10.UltimaEscritura);	
				ejercicio10.UltimaEscritura = this.ID;
				Thread.sleep(1000);
				if (this.contador==0){
					ejercicio10.Activos--;
					System.out.println("Ultima Escritura: " + this.ID + " Quedan: " + ejercicio10.Activos + " threads activos");
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
    }
}
